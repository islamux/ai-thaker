package com.example.aithaker.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.aithaker.common.constants.AppConstants
import com.example.aithaker.data.local.dao.AthkarDao
import com.example.aithaker.data.local.database.AthkarDatabase
import com.example.aithaker.data.local.database.SampleAthkarData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import javax.inject.Provider
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideAthkarDatabase(
        @ApplicationContext context: Context,
        daoProvider: Provider<AthkarDao>
    ): AthkarDatabase {
        return Room.databaseBuilder(
            context,
            AthkarDatabase::class.java,
            AppConstants.DATABASE_NAME
        )
            .fallbackToDestructiveMigration()
            .addCallback(object : RoomDatabase.Callback() {
                override fun onCreate(db: SupportSQLiteDatabase) {
                    super.onCreate(db)
                    // Seed database with sample data on first creation
                    CoroutineScope(Dispatchers.IO + SupervisorJob()).launch {
                        try {
                            val dao = daoProvider.get()
                            dao.insertAllAthkar(SampleAthkarData.getAllAthkar())
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }
                }
            })
            .build()
    }

    @Provides
    fun provideAthkarDao(database: AthkarDatabase): AthkarDao {
        return database.athkarDao()
    }
}
