package com.example.innopolisnewsfetcher.data.api.model

import com.google.gson.annotations.SerializedName

data class NewsModel(
    @SerializedName("articles")
    val articles: List<ArticleModel>
)