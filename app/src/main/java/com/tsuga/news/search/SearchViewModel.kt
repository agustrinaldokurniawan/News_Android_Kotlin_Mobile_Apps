package com.tsuga.news.search

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tsuga.news.core.data.NewsRepository
import com.tsuga.news.core.data.Resource
import com.tsuga.news.core.data.source.local.entity.NewsEntity

class SearchViewModel(private val newsRepository: NewsRepository) : ViewModel() {
    fun searchNews(keyword: String): LiveData<List<NewsEntity>>{
        return newsRepository.getNewsByKeyword(keyword)
    }
}