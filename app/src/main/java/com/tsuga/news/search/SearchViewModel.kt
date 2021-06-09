package com.tsuga.news.search

import androidx.lifecycle.ViewModel
import com.tsuga.news.core.data.NewsRepository

class SearchViewModel(newsRepository: NewsRepository) : ViewModel() {
    val news = newsRepository.getAllNews()
}