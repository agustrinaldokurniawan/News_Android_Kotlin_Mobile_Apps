package com.tsuga.news.core.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.tsuga.news.R
import com.tsuga.news.core.data.source.local.entity.NewsEntity
import com.tsuga.news.databinding.NewsItemBinding

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.ListViewHolder>() {

    private var listData = ArrayList<NewsEntity>()
    var onItemClick: ((NewsEntity) -> Unit)? = null

    fun setData(news: List<NewsEntity>?) {
        if (news == null) return
        listData.clear()
        listData.addAll(news)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
        )

    override fun getItemCount(): Int = listData.size


    override fun onBindViewHolder(holder: NewsAdapter.ListViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data)
    }


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = NewsItemBinding.bind(itemView)
        fun bind(data: NewsEntity) {
            with(binding) {
                Glide.with(itemView)
                    .load(data.urlToImage)
                    .apply(RequestOptions().transform(CenterCrop(), RoundedCorners(13)))
                    .into(ivImage)
                tvTitle.text = data.title
                tvContent.text = data.description
            }
        }

        init {
            binding.root.setOnClickListener {
                onItemClick?.invoke(listData[absoluteAdapterPosition])
            }
        }
    }

}