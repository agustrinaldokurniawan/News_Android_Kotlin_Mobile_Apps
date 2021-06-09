package com.tsuga.news.home

import androidx.lifecycle.ViewModel
import com.tsuga.news.core.data.NewsRepository

class HomeViewModel(newsRepository: NewsRepository) : ViewModel() {
    val news = newsRepository.getAllNews()
}