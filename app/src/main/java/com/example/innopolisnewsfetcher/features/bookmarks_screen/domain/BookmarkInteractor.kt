package com.example.innopolisnewsfetcher.features.bookmarks_screen.domain

import com.example.innopolisnewsfetcher.features.bookmarks_screen.data.BookmarksRepository
import com.example.innopolisnewsfetcher.features.main_screen.domain.model.ArticleDomainModel

class BookmarkInteractor(private val repository: BookmarksRepository) {
    suspend fun create(articleDomainModel: ArticleDomainModel) =
        repository.create(articleDomainModel)

    suspend fun read(): List<ArticleDomainModel> = repository.read()
    suspend fun update(articleDomainModel: ArticleDomainModel) =
        repository.update(articleDomainModel)

    suspend fun delete(articleDomainModel: ArticleDomainModel) =
        repository.delete(articleDomainModel)
}