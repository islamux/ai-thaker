package com.example.aithaker.common.constants

object AppConstants {
    const val DATABASE_NAME = "aithaker_db"
    const val DATABASE_VERSION = 1

    object PreferenceKeys {
        const val THEME_MODE = "theme_mode"
        const val LANGUAGE = "language"
        const val NOTIFICATION_ENABLED = "notification_enabled"
    }

    object Notifications {
        const val CHANNEL_ID = "athkar_reminders"
        const val MORNING_ATHKAR_ID = 1001
        const val EVENING_ATHKAR_ID = 1002
    }
}
