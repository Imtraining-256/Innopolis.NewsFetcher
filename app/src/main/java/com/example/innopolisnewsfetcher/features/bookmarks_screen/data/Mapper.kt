package com.example.innopolisnewsfetcher.features.bookmarks_screen.data

import com.example.innopolisnewsfetcher.features.bookmarks_screen.data.local.BookmarkEntity
import com.example.innopolisnewsfetcher.features.main_screen.domain.model.ArticleDomainModel

fun ArticleDomainModel.toEntityModel() = BookmarkEntity(
    url = url,
    author = author,
    content = content,
    description = description,
    publishedAt = publishedAt,
    title = title,
    urlToImage = urlToImage,
    isBookmarked = isBookmarked
)

fun BookmarkEntity.toDomainModel() = ArticleDomainModel(
    source = null,
    author = author,
    title = title,
    url = url,
    description = description,
    content = content,
    publishedAt = publishedAt,
    urlToImage = urlToImage,
    isBookmarked = isBookmarked
)