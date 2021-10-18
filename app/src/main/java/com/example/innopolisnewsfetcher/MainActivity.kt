package com.example.innopolisnewsfetcher

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.innopolisnewsfetcher.features.main_screen.MainScreenFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.container, MainScreenFragment())
            .commit()
    }
}