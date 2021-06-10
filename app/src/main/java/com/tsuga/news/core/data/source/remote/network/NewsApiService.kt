package com.tsuga.news.core.data.source.remote.network

import com.tsuga.news.core.data.source.remote.response.NewsResponse
import retrofit2.Call
import retrofit2.http.GET

interface NewsApiService {
    @GET("top-headlines?country=id&apiKey=e61bf8073e6d474fb27c45fc8bcdfccf")
    fun getTopHeadlines(): Call<NewsApiResponse>
}