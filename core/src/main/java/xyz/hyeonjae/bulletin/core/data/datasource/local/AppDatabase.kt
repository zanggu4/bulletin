package xyz.hyeonjae.bulletin.core.data.datasource.local

import androidx.room.Database
import androidx.room.RoomDatabase
import xyz.hyeonjae.bulletin.core.data.dto.local.PostLocalDto

@Database(entities = [PostLocalDto::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostLocalDao
}