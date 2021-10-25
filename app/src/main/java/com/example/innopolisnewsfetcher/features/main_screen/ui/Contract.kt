package com.example.innopolisnewsfetcher.features.main_screen.ui

import com.example.innopolisnewsfetcher.base.Event
import com.example.innopolisnewsfetcher.features.main_screen.domain.model.ArticleDomainModel

data class ViewState(
    val ArticleList: List<ArticleDomainModel>,
    val errorMessage: String?,
    val isLoading: Boolean
)

sealed class UIEvent : Event {
    data class OnArticleClick(val articleDomainModel: ArticleDomainModel) : UIEvent()
}

sealed class DataEvent : Event {
    object OnLoadData : DataEvent()
    data class SuccessNewsRequest(val articleModels: List<ArticleDomainModel>) : DataEvent()
    data class ErrorNewsRequest(val errorMessage: String) : DataEvent()
}