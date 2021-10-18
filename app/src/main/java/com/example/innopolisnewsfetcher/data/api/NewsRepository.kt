package com.example.innopolisnewsfetcher.data.api

import com.example.innopolisnewsfetcher.features.main_screen.domain.model.NewsDomainModel

interface NewsRepository {
    suspend fun getNews(): List<NewsDomainModel>
}