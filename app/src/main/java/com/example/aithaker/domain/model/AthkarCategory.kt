package com.example.aithaker.domain.model

enum class AthkarCategory(val displayNameAr: String, val displayNameEn: String) {
    MORNING("أذكار الصباح", "Morning Athkar"),
    EVENING("أذكار المساء", "Evening Athkar"),
    AFTER_PRAYER("أذكار بعد الصلاة", "After Prayer"),
    SLEEPING("أذكار النوم", "Sleeping"),
    WAKING_UP("أذكار الإستيقاظ", "Waking Up"),
    PROTECTION("أذكار الحفظ", "Protection"),
    GENERAL("أذكار عامة", "General Athkar");

    fun getDisplayName(isArabic: Boolean): String {
        return if (isArabic) displayNameAr else displayNameEn
    }
}
