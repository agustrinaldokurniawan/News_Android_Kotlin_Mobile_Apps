package com.tsuga.news.home

import android.os.Bundle
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
import com.tsuga.news.core.data.Resource
import com.tsuga.news.core.ui.NewsAdapter
import com.tsuga.news.core.ui.ViewModelFactory
import com.tsuga.news.databinding.HomeFragmentBinding
import com.tsuga.news.readnews.ReadNews

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
            viewModel = ViewModelProvider(this, factory)[HomeViewModel::class.java]

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

                val randomNumber = (0..(it.data?.size?.minus(1) ?: 10)).random()
                Glide.with(view)
                    .load(it.data?.get(randomNumber)?.urlToImage)
                    .apply(
                        RequestOptions().transform(
                            CenterCrop(),
                            GranularRoundedCorners(0F, 0F, 50F, 40F)
                        )
                    )
                    .into(binding.ivImage)
                binding.tvTitle.text = it.data?.get(randomNumber)?.title
                binding.tvSource.text = it.data?.get(randomNumber)?.source

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