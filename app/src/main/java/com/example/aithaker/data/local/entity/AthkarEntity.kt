package com.example.aithaker.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "athkar")
data class AthkarEntity(
    @PrimaryKey val id: String,
    val arabicText: String,
    val transliteration: String?,
    val translationEn: String,
    val translationAr: String?,
    val category: String,  // Store as String, convert to enum
    val repeatCount: Int,
    val reference: String?,
    val audioUrl: String?,
    val isFavorite: Boolean,
    val orderIndex: Int
)
