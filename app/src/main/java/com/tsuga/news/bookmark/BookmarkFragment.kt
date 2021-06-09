package com.tsuga.news.bookmark

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.tsuga.news.R
import com.tsuga.news.core.ui.NewsAdapter
import com.tsuga.news.core.ui.ViewModelFactory
import com.tsuga.news.databinding.BookmarkFragmentBinding
import com.tsuga.news.readnews.ReadNews

class BookmarkFragment : Fragment() {
    private var _binding: BookmarkFragmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: BookmarkViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = BookmarkFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val newsAdapter = NewsAdapter()

            newsAdapter.onItemClick = {
                val bundle = Bundle()
                bundle.putParcelable("data", it)
                val fragment = ReadNews()
                fragment.arguments = bundle

                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.home_fragment_container, fragment)
                    .addToBackStack(null)
                    .commit()
            }

            val factory = ViewModelFactory.getInstance(requireActivity())
            viewModel = ViewModelProvider(this, factory)[BookmarkViewModel::class.java]

            viewModel.news.observe(viewLifecycleOwner, {
                newsAdapter.setData(it)
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