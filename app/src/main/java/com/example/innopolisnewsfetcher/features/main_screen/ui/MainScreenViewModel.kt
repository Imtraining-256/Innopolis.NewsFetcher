package com.example.innopolisnewsfetcher.features.main_screen.ui

import com.example.innopolisnewsfetcher.base.BaseViewModel
import com.example.innopolisnewsfetcher.base.Event
import com.example.innopolisnewsfetcher.features.main_screen.domain.NewsInteractor

class MainScreenViewModel(private val newsInteractor: NewsInteractor) : BaseViewModel<ViewState>() {

    override fun initialViewState(): ViewState {
        return ViewState(emptyList(), false)
    }

    init {
        processUiEvent(UIEvent.GetCurrentNews)
    }

    override suspend fun reduce(event: Event, previousState: ViewState): ViewState? {
        when (event) {
            is UIEvent.GetCurrentNews -> {
                processDataEvent(DataEvent.OnLoadData)
                newsInteractor.getNews().fold(
                    onError = {
                        processDataEvent(DataEvent.ErrorNewsRequest(it.localizedMessage ?: ""))
                    },
                    onSuccess = {
                        processDataEvent(DataEvent.SuccessNewsRequest(it))
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