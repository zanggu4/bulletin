package xyz.hyeonjae.bulletin.core.data.datasource.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [PostLocalDao::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostLocalDao
}