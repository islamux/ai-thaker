package com.example.aithaker.di

import com.example.aithaker.data.repository.AthkarRepositoryImpl
import com.example.aithaker.domain.repository.AthkarRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindAthkarRepository(
        impl: AthkarRepositoryImpl
    ): AthkarRepository
}
