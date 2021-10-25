package com.example.innopolisnewsfetcher.data.api

import com.example.innopolisnewsfetcher.features.main_screen.domain.model.ArticleDomainModel

interface NewsRepository {
    suspend fun getNews(): List<ArticleDomainModel>
}