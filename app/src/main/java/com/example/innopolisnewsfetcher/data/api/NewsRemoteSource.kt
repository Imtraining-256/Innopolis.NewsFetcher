package com.example.innopolisnewsfetcher.data.api

import com.example.innopolisnewsfetcher.data.api.model.NewsModel

class NewsRemoteSource(private val api: NewsApi) {
    suspend fun getNews(): NewsModel = api.getNews()
}