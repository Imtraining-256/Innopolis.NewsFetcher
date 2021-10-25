package com.example.innopolisnewsfetcher.features.main_screen.ui

import com.example.innopolisnewsfetcher.base.BaseViewModel
import com.example.innopolisnewsfetcher.base.Event
import com.example.innopolisnewsfetcher.features.bookmarks_screen.domain.BookmarkInteractor
import com.example.innopolisnewsfetcher.features.main_screen.domain.NewsInteractor

class MainScreenViewModel(
    private val newsInteractor: NewsInteractor,
    private val bookmarkInteractor: BookmarkInteractor
) : BaseViewModel<ViewState>() {

    init {
        processUiEvent(DataEvent.OnLoadData)
    }

    override fun initialViewState(): ViewState {
        return ViewState(ArticleList = listOf(), errorMessage = null, isLoading = true)
    }

    override suspend fun reduce(event: Event, previousState: ViewState): ViewState? {
        when (event) {
            is UIEvent.OnArticleClick -> {
                bookmarkInteractor.create(event.articleDomainModel)
            }
            is DataEvent.OnLoadData -> {
                newsInteractor.getNews().fold(
                    onSuccess = {
                        processDataEvent(DataEvent.SuccessNewsRequest(it))
                    },
                    onError = {
                        processDataEvent(DataEvent.ErrorNewsRequest(it.localizedMessage ?: ""))
                    }
                )
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