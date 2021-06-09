package com.tsuga.news.search

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.tsuga.news.R
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
                val bundle = Bundle()
                bundle.putParcelable("data", it)
                Log.d("data", it.toString())
                val fragment = ReadNews()
                fragment.arguments = bundle

                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.home_fragment_container, fragment)
                    .addToBackStack(null)
                    .commit()
            }

            val factory = ViewModelFactory.getInstance(requireActivity())
            viewModel = ViewModelProvider(this, factory)[SearchViewModel::class.java]

            viewModel.news.observe(viewLifecycleOwner, {
                if (it != null) {
                    when (it) {
                        is Resource.Loading -> binding.pg.visibility = View.VISIBLE
                        is Resource.Success -> {
                            binding.pg.visibility = View.GONE
                            newsAdapter.setData(it.data)
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

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}