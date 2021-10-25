package com.example.innopolisnewsfetcher.data.api

import com.example.innopolisnewsfetcher.data.toDomain
import com.example.innopolisnewsfetcher.features.main_screen.domain.model.ArticleDomainModel

class NewsRepositoryImp(private val source: NewsRemoteSource) : NewsRepository {
    override suspend fun getNews(): List<ArticleDomainModel> {
        return source.getNews().articles.map { it.toDomain() }
    }
}