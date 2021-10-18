package com.example.innopolisnewsfetcher.features.main_screen.domain

import com.example.innopolisnewsfetcher.base.attempt
import com.example.innopolisnewsfetcher.data.api.NewsRepository

class NewsInteractor(private val newsRepository: NewsRepository) {
    suspend fun getNews() = attempt {
        newsRepository.getNews()
    }
}