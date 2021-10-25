package com.example.innopolisnewsfetcher.features.bookmarks_screen.data.local

import androidx.room.*

@Dao
interface BookmarkDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun create(entity: BookmarkEntity)

    @Query("SELECT * FROM ${BookmarkEntity.TABLE_NAME}")
    suspend fun read(): List<BookmarkEntity>

    @Update
    suspend fun update(entity: BookmarkEntity)

    @Delete
    suspend fun delete(entity: BookmarkEntity)
}