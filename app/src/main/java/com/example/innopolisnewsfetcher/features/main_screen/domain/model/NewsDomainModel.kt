package com.example.innopolisnewsfetcher.features.main_screen.domain.model

data class NewsDomainModel(
    val source: NewsSourceDomainModel,
    val author: String?,
    val title: String?,
    val description: String?,
    val url: String?,
    val urlToImage: String?,
    val publishedAt: String?,
    val content: String?
)