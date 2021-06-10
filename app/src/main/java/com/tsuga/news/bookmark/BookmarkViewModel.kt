package com.tsuga.news.bookmark

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.tsuga.news.core.data.NewsRepository
import com.tsuga.news.core.data.source.local.entity.NewsEntity

class BookmarkViewModel(private val newsRepository: NewsRepository) : ViewModel() {
    val news = newsRepository.getFavoriteNews()

    fun searchQueryBookmark(keyword: String): LiveData<List<NewsEntity>> {
        return newsRepository.getBookmarkByKeyword(keyword)
    }
}