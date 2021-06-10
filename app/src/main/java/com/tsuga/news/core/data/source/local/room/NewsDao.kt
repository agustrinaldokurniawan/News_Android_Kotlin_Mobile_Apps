package com.tsuga.news.core.data.source.local.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.tsuga.news.core.data.source.local.entity.NewsEntity

@Dao
interface NewsDao {
    @Query("select * from news")
    fun getAllNews(): LiveData<List<NewsEntity>>

    @Query("select * from news where isBookmark = 1")
    fun getBookmark(): LiveData<List<NewsEntity>>

    @Query("select * from news where title like :keyword or content like :keyword or description like :keyword or author like :keyword or source like :keyword")
    fun getNewsByKeyword(keyword: String?): LiveData<List<NewsEntity>>

    @Query("select * from news where isBookmark=1 and (title like :keyword or content like :keyword or description like :keyword or author like :keyword or source like :keyword)")
    fun getBookmarkByKeyword(keyword: String?): LiveData<List<NewsEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNews(news: List<NewsEntity>)

    @Update
    fun updateBookmarkNews(news: NewsEntity)
}