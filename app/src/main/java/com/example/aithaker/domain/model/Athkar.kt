package com.example.aithaker.domain.model

data class Athkar(
    val id: String,
    val arabicText: String,
    val transliteration: String? = null,
    val translationEn: String,
    val translationAr: String? = null,
    val category: AthkarCategory,
    val repeatCount: Int = 1,
    val reference: String? = null,
    val audioUrl: String? = null,
    val isFavorite: Boolean = false,
    val orderIndex: Int = 0
)
