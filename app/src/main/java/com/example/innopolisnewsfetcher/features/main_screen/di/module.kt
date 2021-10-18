package com.example.innopolisnewsfetcher.features.main_screen.di

import com.example.innopolisnewsfetcher.features.main_screen.MainScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainScreenModel = module {
    viewModel<MainScreenViewModel>() {
        MainScreenViewModel()
    }
}