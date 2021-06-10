package com.tsuga.news.core.di

import android.content.Context
import com.tsuga.news.core.data.NewsRepository
import com.tsuga.news.core.data.source.local.LocalDataSource
import com.tsuga.news.core.data.source.local.room.NewsDatabase
import com.tsuga.news.core.data.source.remote.RemoteDataSource
import com.tsuga.news.core.data.source.remote.network.NewsApiConfig
import com.tsuga.news.core.utils.AppExecutors

object Injection {
    fun provideRepository(context: Context): NewsRepository {
        val database = NewsDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(NewsApiConfig.provideApiService())
        val localDataSource = LocalDataSource.getInstance(database.newsDao())
        val appExecutors = AppExecutors()

        return NewsRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}