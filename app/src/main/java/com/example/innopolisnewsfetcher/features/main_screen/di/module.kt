package com.example.innopolisnewsfetcher.features.main_screen.di

import com.example.innopolisnewsfetcher.data.api.NewsApi
import com.example.innopolisnewsfetcher.data.api.NewsRemoteSource
import com.example.innopolisnewsfetcher.data.api.NewsRepository
import com.example.innopolisnewsfetcher.data.api.NewsRepositoryImp
import com.example.innopolisnewsfetcher.features.bookmarks_screen.domain.BookmarkInteractor
import com.example.innopolisnewsfetcher.features.main_screen.domain.NewsInteractor
import com.example.innopolisnewsfetcher.features.main_screen.ui.MainScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val mainScreenModel = module {
    viewModel<MainScreenViewModel> {
        MainScreenViewModel(get<NewsInteractor>(), get<BookmarkInteractor>())
    }

    single {
        NewsInteractor(get())
    }

    single<NewsRepository> {
        NewsRepositoryImp(get())
    }

    single {
        NewsRemoteSource(get())
    }

    single {
        get<Retrofit>().create(NewsApi::class.java)
    }
}