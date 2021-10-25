package com.example.innopolisnewsfetcher.data.api

import com.example.innopolisnewsfetcher.data.api.model.NewsModel
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface NewsApi {
    @GET("v2/top-headlines")
    @Headers("X-Api-Key: 0cf24868af49ecb5a3b6f9dc1a5bf55f")
    suspend fun getNews(
//        @Query("q") searchQuery: String = "",
//        @Query("language") language: String = "ru",
        @Query("country") country: String = "ru"
    ): NewsModel
}