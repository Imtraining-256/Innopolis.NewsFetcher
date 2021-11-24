package com.example.innopolisnewsfetcher.features.main_screen.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.innopolisnewsfetcher.R
import com.example.innopolisnewsfetcher.features.main_screen.domain.model.ArticleDomainModel

class ArticlesAdapter(
    private var articleModels: List<ArticleDomainModel>,
    private val onItemClick: (articleModel: ArticleDomainModel) -> Unit
) : RecyclerView.Adapter<ArticlesAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val title: TextView = view.findViewById<TextView>(R.id.tvArticleTitle)
        val img: ImageView = view.findViewById<ImageView>(R.id.tvArticleImage)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = articleModels[position].title
        Glide.with(holder.itemView).load(articleModels[position].urlToImage).into(holder.img)
        holder.itemView.setOnClickListener { onItemClick(articleModels[position]) }
    }

    override fun getItemCount(): Int {
        return articleModels.size
    }

    fun updateArticles(newModels: List<ArticleDomainModel>) {
        articleModels = newModels
        notifyDataSetChanged()
    }

}