package com.tsuga.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.tsuga.news.bookmark.BookmarkFragment
import com.tsuga.news.databinding.ActivityMainBinding
import com.tsuga.news.home.HomeFragment
import com.tsuga.news.search.SearchFragment

@Suppress("Deprecation")
class MainActivity : AppCompatActivity() {
    private lateinit var decorView: View

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        decorView = window.decorView
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        binding.cnb.setItemSelected(R.id.home_menu)
        binding.cnb.setOnItemSelectedListener {
            changeFragment(it)
        }

        supportActionBar?.hide()

        supportFragmentManager.beginTransaction()
            .replace(R.id.home_fragment_container, HomeFragment())
            .commit()

    }
    private fun changeFragment(it: Int) {
        var fragment: Fragment? = null
        when (it) {
            R.id.home_menu -> {
                fragment = HomeFragment()
            }
            R.id.search_menu -> {
                fragment = SearchFragment()
            }
            R.id.bookmark_menu -> {
                fragment = BookmarkFragment()
            }
        }

        if (fragment != null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.home_fragment_container, fragment)
                .commit()
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        }
    }

    override fun onStart() {
        super.onStart()
        supportActionBar?.hide()
    }
}