package com.tsuga.news.core.utils

import android.content.Context
import com.tsuga.news.R
import com.tsuga.news.core.data.source.remote.response.NewsResponse
import org.json.JSONObject
import java.io.IOException

// Because API is expensive, so I use this to reduce the cost while development
class AlternativeAPI(private val context: Context) {
    private fun parsingFileToString(): String? {
        val jsonString: String

        try {
            jsonString = context.resources.openRawResource(R.raw.news_sample).bufferedReader()
                .use { it.readText() }
        } catch (ioException: IOException) {
            ioException.printStackTrace()
            return null
        }

        return jsonString
    }

    fun loadData(): List<NewsResponse> {
        val list = ArrayList<NewsResponse>()
        val response = JSONObject(parsingFileToString().toString())
        val listArray = response.getJSONArray("articles")

        for (i in 0 until listArray.length()) {
            val news = listArray.getJSONObject(i)

            val sourceObject = news.getJSONObject("source")
            val nameSource = sourceObject.getString("name")

            val author = news.getString("author")
            val title = news.getString("title")
            val description = news.getString("description")
            val url = news.getString("url")
            val urlToImage = news.getString("urlToImage")
            val publishedAt = news.getString("publishedAt")
            val content = news.getString("content")

            val newsResponse = NewsResponse(
                source = nameSource,
                author = author,
                title = title,
                description = description,
                url = url,
                urlToImage = urlToImage,
                publishedAt = publishedAt,
                content = content
            )

            list.add(newsResponse)
        }
        return list
    }
}