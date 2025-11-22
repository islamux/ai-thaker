package com.example.aithaker.data.mapper

import com.example.aithaker.data.local.entity.AthkarEntity
import com.example.aithaker.domain.model.Athkar
import com.example.aithaker.domain.model.AthkarCategory

fun AthkarEntity.toDomain(): Athkar {
    return Athkar(
        id = id,
        arabicText = arabicText,
        transliteration = transliteration,
        translationEn = translationEn,
        translationAr = translationAr,
        category = AthkarCategory.valueOf(category),
        repeatCount = repeatCount,
        reference = reference,
        audioUrl = audioUrl,
        isFavorite = isFavorite,
        orderIndex = orderIndex
    )
}

fun Athkar.toEntity(): AthkarEntity {
    return AthkarEntity(
        id = id,
        arabicText = arabicText,
        transliteration = transliteration,
        translationEn = translationEn,
        translationAr = translationAr,
        category = category.name,
        repeatCount = repeatCount,
        reference = reference,
        audioUrl = audioUrl,
        isFavorite = isFavorite,
        orderIndex = orderIndex
    )
}
