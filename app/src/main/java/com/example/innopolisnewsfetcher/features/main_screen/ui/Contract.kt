package com.example.innopolisnewsfetcher.features.main_screen.ui

import com.example.innopolisnewsfetcher.base.Event
import com.example.innopolisnewsfetcher.features.main_screen.domain.model.NewsDomainModel

data class ViewState(
    val ArticleList: List<NewsDomainModel>,
    //val errorMessage: String
    val isLoading: Boolean
)

sealed class UIEvent : Event {
    object GetCurrentNews : UIEvent()
}

sealed class DataEvent : Event {
    object OnLoadData : DataEvent()
    data class SuccessNewsRequest(val articleModels: List<NewsDomainModel>) : DataEvent()
    data class ErrorNewsRequest(val errorMessage: String) : DataEvent()
}