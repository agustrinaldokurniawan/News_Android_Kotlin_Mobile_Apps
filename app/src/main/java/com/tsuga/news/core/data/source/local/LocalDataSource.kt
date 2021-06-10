package com.tsuga.news.core.data.source.local

import androidx.lifecycle.LiveData
import com.tsuga.news.core.data.source.local.entity.NewsEntity
import com.tsuga.news.core.data.source.local.room.NewsDao

class LocalDataSource private constructor(private val newsDao: NewsDao) {
    companion object {
        private var instance: LocalDataSource? = null

        fun getInstance(newsDao: NewsDao): LocalDataSource =
            instance ?: synchronized(this) {
                instance ?: LocalDataSource(newsDao)
            }
    }

    fun getAllNews(): LiveData<List<NewsEntity>> = newsDao.getAllNews()
    fun getBookmarkNews(): LiveData<List<NewsEntity>> = newsDao.getBookmark()
    fun getNewsByKeyword(keyword: String): LiveData<List<NewsEntity>> =
        newsDao.getNewsByKeyword("%$keyword%")

    fun insertNews(newsList: List<NewsEntity>) = newsDao.insertNews(newsList)
    fun setBookmarkNews(newsEntity: NewsEntity, newState: Boolean) {
        newsEntity.isBookmark = newState
        newsDao.updateBookmarkNews(newsEntity)
    }
    fun getBookmarkByKeyword(keyword: String): LiveData<List<NewsEntity>> =
        newsDao.getBookmarkByKeyword("%$keyword%")
}