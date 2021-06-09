package com.tsuga.news.core.data.source.remote

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.tsuga.news.core.data.source.remote.network.ApiResponse
import com.tsuga.news.core.data.source.remote.response.NewsResponse
import com.tsuga.news.core.utils.AlternativeAPI
import org.json.JSONException

class RemoteDataSource private constructor(private val alternativeAPI: AlternativeAPI) {
    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(alternativeAPI: AlternativeAPI): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(alternativeAPI)
            }
    }

    fun getAllNews(): LiveData<ApiResponse<List<NewsResponse>>> {
        val resultData = MutableLiveData<ApiResponse<List<NewsResponse>>>()

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            try {
                val dataArray = alternativeAPI.loadData()
                if (dataArray.isNotEmpty()) {
                    resultData.value = ApiResponse.Success(dataArray)
                } else {
                    resultData.value = ApiResponse.Empty
                }
            } catch (e: JSONException) {
                resultData.value = ApiResponse.Error(e.toString())
            }
        }, 2000)
        return resultData
    }
}