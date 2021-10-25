package com.example.innopolisnewsfetcher

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.innopolisnewsfetcher.features.bookmarks_screen.data.local.BookmarkDAO
import com.example.innopolisnewsfetcher.features.bookmarks_screen.data.local.BookmarkEntity

@Database(entities = [BookmarkEntity::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun bookmarks(): BookmarkDAO
}