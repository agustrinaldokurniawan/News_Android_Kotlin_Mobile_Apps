package com.tsuga.news.core.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.tsuga.news.core.data.source.remote.network.ApiResponse
import com.tsuga.news.core.utils.AppExecutors

abstract class NetworkBoundResource<ResultType, RequestType>(private val mExecutors: AppExecutors) {
    private val result = MediatorLiveData<Resource<ResultType>>()

    init {
        result.value = Resource.Loading(null)

        @Suppress("LeakingThis")
        val dbSource = loadFromDB()

        result.addSource(dbSource) { data ->
            result.removeSource(dbSource)
            if (shouldFetch(data)) {
                fetchFromNetwork(dbSource)
            } else {
                result.addSource(dbSource) { newData ->
                    result.value = Resource.Success(newData)
                }
            }
        }
    }


    protected abstract fun shouldFetch(data: ResultType?): Boolean

    protected abstract fun loadFromDB(): LiveData<ResultType>

    protected open fun onFetchFailed() {}

    protected abstract fun createCall(): LiveData<ApiResponse<RequestType>>

    protected abstract fun saveCallResult(data: RequestType)

    protected fun fetchFromNetwork(dbSource: LiveData<ResultType>) {
        val apiResponse = createCall()

        result.addSource(dbSource) { newData ->
            result.value = Resource.Loading(newData)
        }

        result.addSource(apiResponse) { response ->
            result.removeSource(apiResponse)
            result.removeSource(dbSource)
            when (response) {
                is ApiResponse.Success ->
                    mExecutors.diskIO().execute {
                        saveCallResult(response.data)
                        mExecutors.mainThread().execute {
                            result.addSource(loadFromDB()) { newData ->
                                result.value = Resource.Success(newData)
                            }
                        }
                    }
                is ApiResponse.Empty ->
                    mExecutors.mainThread().execute {
                        result.addSource(loadFromDB()) { newData ->
                            result.value = Resource.Success(newData)
                        }
                    }
                is ApiResponse.Error -> {
                    onFetchFailed()
                    result.addSource(dbSource) { newData ->
                        result.value = Resource.Error(response.errorMessage, newData)
                    }
                }
            }
        }
    }

    fun asLiveData(): LiveData<Resource<ResultType>> = result
}