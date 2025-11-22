package com.example.aithaker.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.aithaker.data.local.dao.AthkarDao
import com.example.aithaker.data.local.entity.AthkarEntity

@Database(
    entities = [AthkarEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class AthkarDatabase : RoomDatabase() {
    abstract fun athkarDao(): AthkarDao
}
