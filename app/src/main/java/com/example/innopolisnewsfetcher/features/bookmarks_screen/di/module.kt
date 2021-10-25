package com.example.innopolisnewsfetcher.features.bookmarks_screen.di

import com.example.innopolisnewsfetcher.features.bookmarks_screen.data.BookmarksRepository
import com.example.innopolisnewsfetcher.features.bookmarks_screen.data.BookmarksRepositoryImpl
import com.example.innopolisnewsfetcher.features.bookmarks_screen.data.local.BookmarkDAO
import com.example.innopolisnewsfetcher.features.bookmarks_screen.domain.BookmarkInteractor
import com.example.innopolisnewsfetcher.features.bookmarks_screen.ui.BookmarksViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val bookmarksModule = module {
    single<BookmarksRepository> {
        BookmarksRepositoryImpl(get<BookmarkDAO>())
    }

    single<BookmarkInteractor> {
        BookmarkInteractor(get<BookmarksRepository>())
    }

    viewModel<BookmarksViewModel> {
        BookmarksViewModel(get<BookmarkInteractor>())
    }
}