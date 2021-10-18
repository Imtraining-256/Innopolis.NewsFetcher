package com.example.innopolisnewsfetcher.data

import com.example.innopolisnewsfetcher.data.api.model.ArticleModel
import com.example.innopolisnewsfetcher.data.api.model.NewsSourceModel
import com.example.innopolisnewsfetcher.features.main_screen.domain.model.NewsDomainModel
import com.example.innopolisnewsfetcher.features.main_screen.domain.model.NewsSourceDomainModel

fun NewsSourceModel.toDomain(): NewsSourceDomainModel {
    return NewsSourceDomainModel(
        id = id,
        name = name
    )
}

fun ArticleModel.toDomain(): NewsDomainModel {
    return NewsDomainModel(
        source = source.toDomain(),
        author = author,
        title = title,
        description = description,
        url = url,
        urlToImage = urlToImage,
        publishedAt = publishedAt,
        content = content
    )
}