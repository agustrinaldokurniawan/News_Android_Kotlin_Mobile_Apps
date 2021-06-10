package com.tsuga.news.search

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.tsuga.news.ReadNewsActivity
import com.tsuga.news.core.data.Resource
import com.tsuga.news.core.ui.NewsAdapter
import com.tsuga.news.core.ui.ViewModelFactory
import com.tsuga.news.databinding.SearchFragmentBinding
import com.tsuga.news.readnews.ReadNews

class SearchFragment : Fragment() {
    private var _binding: SearchFragmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: SearchViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = SearchFragmentBinding.inflate(layoutInflater, container, false)
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


            viewModel = ViewModelProvider(this, factory)[SearchViewModel::class.java]

            viewModel.searchNews("").observe(viewLifecycleOwner, {
                if (it != null) {
                    newsAdapter.setData(it)
                }
            })

            binding.etNews.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                }

                override fun onTextChanged(
                    s: CharSequence?,
                    start: Int,
                    before: Int,
                    count: Int
                ) {
                    viewModel.searchNews(s.toString()).observe(viewLifecycleOwner, { query_data->
                        query_data.let{
                            newsAdapter.setData(it)
                        }
                    })
                }

                override fun afterTextChanged(s: Editable?) {

                }

            })

            with(binding.rvNews) {
                layoutManager = LinearLayoutManager(context)
                adapter = newsAdapter
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}