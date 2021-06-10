package com.tsuga.news.core.data

import android.util.Log
import androidx.lifecycle.LiveData
import com.tsuga.news.core.data.source.local.LocalDataSource
import com.tsuga.news.core.data.source.local.entity.NewsEntity
import com.tsuga.news.core.data.source.remote.RemoteDataSource
import com.tsuga.news.core.data.source.remote.network.ApiResponse
import com.tsuga.news.core.data.source.remote.response.NewsResponse
import com.tsuga.news.core.utils.AppExecutors
import com.tsuga.news.core.utils.DataMapper

class NewsRepository private constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val executors: AppExecutors
) {
    companion object {
        @Volatile
        private var instance: NewsRepository? = null

        fun getInstance(
            remoteDataSource: RemoteDataSource,
            localDataSource: LocalDataSource,
            appExecutors: AppExecutors
        ): NewsRepository =
            instance ?: synchronized(this) {
                instance ?: NewsRepository(remoteDataSource, localDataSource, appExecutors)
            }
    }

    fun getAllNews(): LiveData<Resource<List<NewsEntity>>> =
        object : NetworkBoundResource<List<NewsEntity>, List<NewsResponse>>(executors) {
            override fun shouldFetch(data: List<NewsEntity>?): Boolean {
                return data == null || data.isEmpty()
            }

            override fun loadFromDB(): LiveData<List<NewsEntity>> {
                return localDataSource.getAllNews()
            }

            override fun createCall(): LiveData<ApiResponse<List<NewsResponse>>> {
                return remoteDataSource.getAllNews()
            }

            override fun saveCallResult(data: List<NewsResponse>) {
                val newsList = DataMapper.mapResponsesToEntities(data)
                localDataSource.insertNews(newsList)
            }
        }.asLiveData()

    fun getFavoriteNews(): LiveData<List<NewsEntity>> {
        return localDataSource.getBookmarkNews()
    }

    fun setBookmarkNews(news: NewsEntity, state: Boolean) {
        executors.diskIO().execute { localDataSource.setBookmarkNews(news, state) }
    }

    fun getNewsByKeyword(keyword: String): LiveData<List<NewsEntity>> {
        return localDataSource.getNewsByKeyword(keyword)
    }

    fun getBookmarkByKeyword(keyword: String): LiveData<List<NewsEntity>> {
        return localDataSource.getBookmarkByKeyword(keyword)
    }
}