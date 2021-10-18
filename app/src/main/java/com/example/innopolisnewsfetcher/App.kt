package com.example.innopolisnewsfetcher

import android.app.Application
import com.example.innopolisnewsfetcher.di.appModule
import com.example.innopolisnewsfetcher.features.main_screen.di.mainScreenModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(appModule, mainScreenModel)
        }
    }
}