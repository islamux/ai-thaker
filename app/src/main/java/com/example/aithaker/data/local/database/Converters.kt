package com.example.aithaker.data.local.database

import androidx.room.TypeConverter
import com.example.aithaker.domain.model.AthkarCategory

class Converters {
    @TypeConverter
    fun fromCategory(category: AthkarCategory): String {
        return category.name
    }

    @TypeConverter
    fun toCategory(value: String): AthkarCategory {
        return AthkarCategory.valueOf(value)
    }
}
