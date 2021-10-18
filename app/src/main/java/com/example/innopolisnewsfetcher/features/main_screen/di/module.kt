package com.example.innopolisnewsfetcher.features.main_screen.di

import com.example.innopolisnewsfetcher.data.api.NewsApi
import com.example.innopolisnewsfetcher.data.api.NewsRemoteSource
import com.example.innopolisnewsfetcher.data.api.NewsRepositoryImp
import com.example.innopolisnewsfetcher.features.main_screen.MainScreenViewModel
import com.example.innopolisnewsfetcher.features.main_screen.domain.NewsInteractor
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val mainScreenModel = module {
    viewModel<MainScreenViewModel> {
        MainScreenViewModel()
    }

    single {
        NewsInteractor(get())
    }

    single {
        NewsRepositoryImp(get())
    }

    single {
        NewsRemoteSource(get())
    }

    single {
        get<Retrofit>().create(NewsApi::class.java)
    }
}