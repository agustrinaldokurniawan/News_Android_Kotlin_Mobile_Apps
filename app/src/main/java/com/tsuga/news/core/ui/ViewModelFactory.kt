package com.tsuga.news.core.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tsuga.news.bookmark.BookmarkViewModel
import com.tsuga.news.core.data.NewsRepository
import com.tsuga.news.core.di.Injection
import com.tsuga.news.home.HomeViewModel
import com.tsuga.news.readnews.ReadNewsViewModel
import com.tsuga.news.search.SearchViewModel

class ViewModelFactory private constructor(private val newsRepository: NewsRepository) :
    ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(context: Context): ViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: ViewModelFactory(
                    Injection.provideRepository(
                        context
                    )
                )
            }

    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        when {
            modelClass.isAssignableFrom(HomeViewModel::class.java) -> {
                HomeViewModel(newsRepository) as T
            }
            modelClass.isAssignableFrom(BookmarkViewModel::class.java) -> {
                BookmarkViewModel(newsRepository) as T
            }
            modelClass.isAssignableFrom(SearchViewModel::class.java) -> {
                SearchViewModel(newsRepository) as T
            }
            modelClass.isAssignableFrom(ReadNewsViewModel::class.java) -> {
                ReadNewsViewModel(newsRepository) as T
            }
            else -> throw Throwable("Unknown Viewmodel class: " + modelClass.name)
        }

}