package com.tsuga.news.readnews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.tsuga.news.databinding.WebviewBinding

class WebView : Fragment() {
    private var _binding: WebviewBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = WebviewBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val url = arguments?.getString("url")
        val title = arguments?.getString("title")

        if (url != null) {
            val webSettings = binding?.webview?.settings
            webSettings?.domStorageEnabled = true

            binding?.webview?.webViewClient = object : WebViewClient() {
                override fun shouldOverrideUrlLoading(
                    view: WebView?,
                    request: WebResourceRequest?
                ): Boolean {
                    return super.shouldOverrideUrlLoading(view, request)
                }

                override fun onPageFinished(view: WebView?, url: String?) {
                    super.onPageFinished(view, url)
                    if (binding?.pg?.visibility == View.VISIBLE) {
                        binding?.pg?.visibility = View.GONE
                    }
                }

                override fun onReceivedError(
                    view: WebView?,
                    request: WebResourceRequest?,
                    error: WebResourceError?
                ) {
                    super.onReceivedError(view, request, error)
                    binding?.tvError?.visibility = View.VISIBLE
                }
            }
            binding?.webview?.loadUrl(url)
            binding?.tvTitle?.text = title
            binding?.btnClose?.setOnClickListener {
                detachFragment()
            }
        } else {
            Toast.makeText(requireContext(), "Invalid Url!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun detachFragment() {
        activity?.onBackPressed()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}