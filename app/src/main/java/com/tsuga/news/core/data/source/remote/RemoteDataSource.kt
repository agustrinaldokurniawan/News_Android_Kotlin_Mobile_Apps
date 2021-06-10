package com.tsuga.news.core.data.source.remote

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.tsuga.news.core.data.source.remote.network.ApiResponse
import com.tsuga.news.core.data.source.remote.network.NewsApiResponse
import com.tsuga.news.core.data.source.remote.network.NewsApiService
import com.tsuga.news.core.data.source.remote.response.NewsResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RemoteDataSource private constructor(private val newsApiService: NewsApiService) {
    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(newsApiService: NewsApiService): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(newsApiService)
            }
    }

    fun getAllNews(): LiveData<ApiResponse<List<NewsResponse>>> {
        val resultData = MutableLiveData<ApiResponse<List<NewsResponse>>>()

        val client = newsApiService.getTopHeadlines()

        client.enqueue(object : Callback<NewsApiResponse> {
            override fun onResponse(
                call: Call<NewsApiResponse>,
                response: Response<NewsApiResponse>
            ) {
                val dataArray = response.body()?.articles
                val list = ArrayList<NewsResponse>()
                if (dataArray != null) {
                    for (i in dataArray.indices) {
                        val news = dataArray[i]

                        var newsResponse : NewsResponse? = null
                        if(news != null){
                            val sourceObject = news.source
                            val nameSource = sourceObject?.name

                            val author = news.author
                            val title = news.title
                            val description = news.description
                            val url = news.url
                            val urlToImage = news.urlToImage
                            val publishedAt = news.publishedAt
                            val content = news.content

                            newsResponse = NewsResponse(
                                source = nameSource as String,
                                author = author as String,
                                title = title as String,
                                description = description as String,
                                url = url as String,
                                urlToImage = urlToImage as String,
                                publishedAt = publishedAt as String,
                                content = content  ?: "[Empty]"
                            )
                        }


                        if (newsResponse != null) {
                            list.add(newsResponse)
                        }
                    }
                    resultData.value =
                        if (list !== null) ApiResponse.Success(list) else ApiResponse.Empty
                }
            }

            override fun onFailure(call: Call<NewsApiResponse>, t: Throwable) {
                resultData.value = ApiResponse.Error(t.message.toString())
            }

        })
        return resultData
    }
}