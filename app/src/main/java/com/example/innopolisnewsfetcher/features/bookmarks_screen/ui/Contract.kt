package com.example.innopolisnewsfetcher.features.bookmarks_screen.ui

import com.example.innopolisnewsfetcher.base.Event
import com.example.innopolisnewsfetcher.features.main_screen.domain.model.ArticleDomainModel

data class ViewState(
    val articleList: List<ArticleDomainModel>
)

sealed class DataEvent : Event {
    object RefreshDataBase : DataEvent()
}