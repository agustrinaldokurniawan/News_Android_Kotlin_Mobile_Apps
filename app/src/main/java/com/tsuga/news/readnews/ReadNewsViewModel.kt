package com.tsuga.news.readnews

import androidx.lifecycle.ViewModel
import com.tsuga.news.core.data.NewsRepository
import com.tsuga.news.core.data.source.local.entity.NewsEntity

class ReadNewsViewModel(private val newsRepository: NewsRepository) : ViewModel() {
    val news = newsRepository.getAllNews()
    fun setBookmarkNews(news: NewsEntity, newState: Boolean) =
        newsRepository.setBookmarkNews(news, newState)
}