package com.tsuga.news.core.data.source.local.room

import androidx.room.*
import com.tsuga.news.core.data.source.local.entity.NewsEntity
import io.reactivex.Completable
import io.reactivex.Flowable

@Dao
interface NewsDao {
    @Query("select * from news")
    fun getAllNews(): Flowable<List<NewsEntity>>

    @Query("select * from news where isBookmark = 1")
    fun getBookmark(): Flowable<List<NewsEntity>>

    @Query("select * from news where title like :keyword or content like :keyword or description like :keyword or author like :keyword or source like :keyword")
    fun getNewsByKeyword(keyword: String?): Flowable<List<NewsEntity>>

    @Query("select * from news where isBookmark=1 and (title like :keyword or content like :keyword or description like :keyword or author like :keyword or source like :keyword)")
    fun getBookmarkByKeyword(keyword: String?): Flowable<List<NewsEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNews(news: List<NewsEntity>) : Completable

    @Update
    fun updateBookmarkNews(news: NewsEntity)
}