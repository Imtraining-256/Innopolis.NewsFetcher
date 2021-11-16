package com.example.innopolisnewsfetcher.data

import com.example.innopolisnewsfetcher.data.api.model.ArticleModel
import com.example.innopolisnewsfetcher.data.api.model.NewsSourceModel
import com.example.innopolisnewsfetcher.features.main_screen.domain.model.ArticleDomainModel
import com.example.innopolisnewsfetcher.features.main_screen.domain.model.NewsSourceDomainModel

fun NewsSourceModel.toDomain(): NewsSourceDomainModel {
    return NewsSourceDomainModel(
        id = id,
        name = name
    )
}

fun ArticleModel.toDomain(): ArticleDomainModel {
    return ArticleDomainModel(
        source = source.toDomain(),
        author = author ?: "null",
        title = title,
        description = description ?: "null",
        url = url,
        urlToImage = urlToImage ?: "null",
        publishedAt = publishedAt,
        content = content ?: "null",
        isBookmarked = false
    )
}