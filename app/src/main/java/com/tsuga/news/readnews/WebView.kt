package com.tsuga.news.readnews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.tsuga.news.core.data.source.local.entity.NewsEntity
import com.tsuga.news.databinding.WebviewBinding

class WebView : Fragment() {
    private lateinit var binding: WebviewBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = WebviewBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val url = arguments?.getString("url")
        val title = arguments?.getString("title")

        if (url != null) {
            binding.webview.webViewClient = WebViewClient()
            binding.webview.loadUrl(url)
            binding.tvTitle.text = title
            binding.btnClose.setOnClickListener {
                detachFragment()
            }
        } else {
            Toast.makeText(requireContext(), "Invalid Url!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun detachFragment() {
        requireActivity().supportFragmentManager.popBackStack()
    }
}