package com.example.innopolisnewsfetcher.data.api

import com.example.innopolisnewsfetcher.data.api.model.NewsModel
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface NewsApi {
    @GET("v2/top-headlines")
    @Headers("X-Api-Key: 2e95f435012741bf9878ebfdae96973b")
    suspend fun getNews(
        @Query("country") country: String = "ru"
    ): NewsModel
}