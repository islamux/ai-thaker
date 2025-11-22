package com.example.aithaker.common.extensions

import java.time.LocalTime

/**
 * Check if current time is in the morning (before noon)
 */
fun isCurrentTimeMorning(): Boolean {
    return LocalTime.now().hour < 12
}

/**
 * Check if current time is in the evening (after noon)
 */
fun isCurrentTimeEvening(): Boolean {
    return LocalTime.now().hour >= 12
}

/**
 * Get greeting based on current time
 */
fun getTimeBasedGreeting(): String {
    return when (LocalTime.now().hour) {
        in 0..11 -> "صباح الخير"
        in 12..17 -> "مساء الخير"
        else -> "مساء الخير"
    }
}

/**
 * Format time for display
 */
fun getCurrentTimeFormatted(): String {
    val now = LocalTime.now()
    return String.format("%02d:%02d", now.hour, now.minute)
}
