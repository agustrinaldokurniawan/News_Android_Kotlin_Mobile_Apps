package com.tsuga.news.core.utils

import com.tsuga.news.core.data.source.local.entity.NewsEntity
import com.tsuga.news.core.data.source.remote.response.NewsResponse
import com.tsuga.news.core.domain.model.News

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

    fun mapEntitiesToDomain(input: List<NewsEntity>): List<News> {
        return input.map {
            News(
                publishedAt = it.publishedAt,
                author = it.author,
                urlToImage = it.urlToImage,
                description = it.description,
                title = it.title,
                source = it.source,
                url = it.url,
                content = it.content,
                isBookmark = it.isBookmark
            )
        }
    }

    fun mapDomainToEntity(input: News): NewsEntity {
        return NewsEntity(
            publishedAt = input.publishedAt,
            author = input.author,
            urlToImage = input.urlToImage,
            description = input.description,
            title = input.title,
            source = input.source,
            url = input.url,
            content = input.content,
            isBookmark = input.isBookmark
        )
    }
}