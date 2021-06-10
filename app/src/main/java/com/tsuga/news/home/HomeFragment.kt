package com.tsuga.news.home

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.tsuga.news.R
import com.tsuga.news.ReadNewsActivity
import com.tsuga.news.WebViewActivity
import com.tsuga.news.core.data.Resource
import com.tsuga.news.core.data.source.local.entity.NewsEntity
import com.tsuga.news.core.ui.NewsAdapter
import com.tsuga.news.core.ui.ViewModelFactory
import com.tsuga.news.databinding.HomeFragmentBinding
import com.tsuga.news.readnews.ReadNews
import com.tsuga.news.readnews.WebView

class HomeFragment : Fragment() {
    private var _binding: HomeFragmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = HomeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val newsAdapter = NewsAdapter()

            newsAdapter.onItemClick = {
                val intent = Intent(activity, ReadNewsActivity::class.java)
                intent.putExtra(ReadNewsActivity.DATA, it)
                startActivity(intent)
            }

            val factory = ViewModelFactory.getInstance(requireActivity())
            viewModel = ViewModelProvider(this, factory)[HomeViewModel::class.java]

            viewModel.news.observe(viewLifecycleOwner, {
                if (it != null) {
                    when (it) {
                        is Resource.Loading -> binding.pg.visibility = View.VISIBLE
                        is Resource.Success -> {
                            binding.pg.visibility = View.GONE
                            newsAdapter.setData(it.data)
                            if (it.data != null) {

                                val randomNumber = (0..(it.data.size.minus(1) ?: 10)).random()
                                Glide.with(view)
                                    .load(it.data[randomNumber].urlToImage)
                                    .apply(
                                        RequestOptions().transform(
                                            CenterCrop(),
                                            GranularRoundedCorners(0F, 0F, 50F, 40F)
                                        )
                                    )
                                    .into(binding.ivImage)
                                binding.tvTitle.text = it.data[randomNumber].title
                                binding.tvSource.text = it.data[randomNumber].source

                                binding.btnReadMore.setOnClickListener { _ ->
                                    openUrl(
                                        it.data[randomNumber].title,
                                        it.data[randomNumber].url
                                    )
                                }
                            }
                        }
                        is Resource.Error -> {
                            binding.pg.visibility = View.GONE
                            binding.tvError.visibility = View.VISIBLE
                        }
                    }
                }
            })
            with(binding.rvNews) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = newsAdapter
            }
        }
    }

    private fun openUrl(title: String?, url: String?) {
        val intent = Intent(activity, WebViewActivity::class.java)
        intent.putExtra(WebViewActivity.URL, url)
        intent.putExtra(WebViewActivity.TITLE, title)
        startActivity(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}