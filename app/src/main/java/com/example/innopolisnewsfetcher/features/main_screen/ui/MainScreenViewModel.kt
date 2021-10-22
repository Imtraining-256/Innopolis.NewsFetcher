package com.example.innopolisnewsfetcher.features.main_screen.ui

import com.example.innopolisnewsfetcher.base.BaseViewModel
import com.example.innopolisnewsfetcher.base.Event
import com.example.innopolisnewsfetcher.features.main_screen.domain.NewsInteractor

class MainScreenViewModel(private val newsInteractor: NewsInteractor) : BaseViewModel<ViewState>() {

    init {
        processUiEvent(UIEvent.GetCurrentNews)
    }

    override fun initialViewState(): ViewState {
        return ViewState(ArticleList = listOf(), errorMessage = null, isLoading = true)
    }

    override suspend fun reduce(event: Event, previousState: ViewState): ViewState? {
        when (event) {
            is UIEvent.GetCurrentNews -> {
                processDataEvent(DataEvent.OnLoadData)
                newsInteractor.getNews().fold(
                    onSuccess = {
                        processDataEvent(DataEvent.SuccessNewsRequest(it))
                    },
                    onError = {
                        processDataEvent(DataEvent.ErrorNewsRequest(it.localizedMessage ?: ""))
                    }
                )
            }
            is DataEvent.OnLoadData -> {
                return previousState.copy(isLoading = true)
            }

            is DataEvent.SuccessNewsRequest -> {
                return previousState.copy(ArticleList = event.articleModels, isLoading = false)
            }

            is DataEvent.ErrorNewsRequest -> {
            }
        }

        return null
    }
}