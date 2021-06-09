package com.tsuga.news.core.utils

import com.tsuga.news.core.data.source.local.entity.NewsEntity
import com.tsuga.news.core.data.source.remote.response.NewsResponse

object DataMapper {
    fun mapResponsesToEntities(input: List<NewsResponse>): List<NewsEntity> {
        val newsList = ArrayList<NewsEntity>()

        input.map {
            val news = NewsEntity(
                publishedAt = it.publishedAt,
                author = it.author,
                urlToImage = it.urlToImage,
                description = it.description,
                title = it.title,
                source = it.source,
                url = it.url,
                content = it.content
            )
            newsList.add(news)
        }
        return newsList
    }
}