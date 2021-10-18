package com.example.innopolisnewsfetcher.data.api.model

import com.google.gson.annotations.SerializedName

class NewsSourceModel(
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String?
)