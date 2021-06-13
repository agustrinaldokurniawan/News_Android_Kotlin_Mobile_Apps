package com.tsuga.news.core.data.source.remote.network

import com.google.gson.annotations.SerializedName

data class NewsApiResponse(

    @field:SerializedName("articles")
    val articles: List<ArticlesItem?>? = null,

    )

data class Source(

    @field:SerializedName("name")
    val name: String? = null,

    )

data class ArticlesItem(

    @field:SerializedName("publishedAt")
    val publishedAt: String? = null,

    @field:SerializedName("author")
    val author: String? = null,

    @field:SerializedName("urlToImage")
    val urlToImage: String? = null,

    @field:SerializedName("description")
    val description: String? = null,

    @field:SerializedName("source")
    val source: Source? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("url")
    val url: String? = null,

    @field:SerializedName("content")
    val content: String? = null
)
