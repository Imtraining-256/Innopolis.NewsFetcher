package com.example.innopolisnewsfetcher.features.bookmarks_screen.data

import com.example.innopolisnewsfetcher.features.main_screen.domain.model.ArticleDomainModel

interface BookmarksRepository {
    suspend fun create(articleDomainModel: ArticleDomainModel)
    suspend fun read(): List<ArticleDomainModel>
    suspend fun update(articleDomainModel: ArticleDomainModel)
    suspend fun delete(articleDomainModel: ArticleDomainModel)
}