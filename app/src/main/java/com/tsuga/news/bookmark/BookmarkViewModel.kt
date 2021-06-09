package com.tsuga.news.bookmark

import androidx.lifecycle.ViewModel
import com.tsuga.news.core.data.NewsRepository

class BookmarkViewModel(newsRepository: NewsRepository) : ViewModel() {
    val news = newsRepository.getFavoriteNews()
}