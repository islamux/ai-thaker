package com.example.aithaker.common.extensions

import com.example.aithaker.domain.model.Athkar

/**
 * Check if athkar needs counter (has repeat count > 1)
 */
fun Athkar.needsCounter(): Boolean = repeatCount > 1

/**
 * Check if athkar is completed based on current count
 */
fun Athkar.isCompleted(currentCount: Int): Boolean = currentCount >= repeatCount

/**
 * Get progress percentage
 */
fun Athkar.getProgressPercentage(currentCount: Int): Float {
    if (repeatCount <= 0) return 0f
    return (currentCount.toFloat() / repeatCount.toFloat()).coerceIn(0f, 1f)
}

/**
 * Get remaining count
 */
fun Athkar.getRemainingCount(currentCount: Int): Int {
    return (repeatCount - currentCount).coerceAtLeast(0)
}

/**
 * Format display text with ellipsis if too long
 */
fun Athkar.getShortArabicText(maxLength: Int = 100): String {
    return if (arabicText.length > maxLength) {
        arabicText.take(maxLength) + "..."
    } else {
        arabicText
    }
}
