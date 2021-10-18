package com.example.innopolisnewsfetcher.features.main_screen.domain

import com.example.innopolisnewsfetcher.data.api.NewsRepository
import com.example.innopolisnewsfetcher.features.main_screen.domain.model.NewsDomainModel

class NewsInteractor(private val newsRepository: NewsRepository) {
    suspend fun getNews(): List<NewsDomainModel> {
        return newsRepository.getNews()
    }
}