package com.example.innopolisnewsfetcher.features.main_screen.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.innopolisnewsfetcher.R
import com.example.innopolisnewsfetcher.features.main_screen.domain.model.NewsDomainModel

class ArticlesAdapter(private var models: List<NewsDomainModel>) :
    RecyclerView.Adapter<ArticlesAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val title: TextView

        init {
            this.title = view.findViewById<TextView>(R.id.textView)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = models[position].title
    }

    override fun getItemCount(): Int {
        return models.size
    }

    fun updateArticles(newModels: List<NewsDomainModel>) {
        models = newModels
        notifyDataSetChanged()
    }

}