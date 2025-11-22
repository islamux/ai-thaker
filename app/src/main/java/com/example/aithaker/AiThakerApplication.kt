package com.example.aithaker

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class AiThakerApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize any global configurations here
    }
}
