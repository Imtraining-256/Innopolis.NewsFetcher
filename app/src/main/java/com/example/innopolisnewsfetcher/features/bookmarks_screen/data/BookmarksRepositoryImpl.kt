package com.example.innopolisnewsfetcher.features.bookmarks_screen.data

import com.example.innopolisnewsfetcher.features.bookmarks_screen.data.local.BookmarkDAO
import com.example.innopolisnewsfetcher.features.main_screen.domain.model.ArticleDomainModel

class BookmarksRepositoryImpl(private val bookmarkDAO: BookmarkDAO) : BookmarksRepository {
    override suspend fun create(newsDomainModel: ArticleDomainModel) {
        bookmarkDAO.create(newsDomainModel.toEntityModel())
    }

    override suspend fun read(): List<ArticleDomainModel> {
        return bookmarkDAO.read().map { it.toDomainModel() }
    }

    override suspend fun update(newsDomainModel: ArticleDomainModel) {
        bookmarkDAO.update(newsDomainModel.toEntityModel())
    }

    override suspend fun delete(newsDomainModel: ArticleDomainModel) {
        bookmarkDAO.delete(newsDomainModel.toEntityModel())
    }
}