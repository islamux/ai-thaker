package com.example.aithaker.ui.screens.home

import com.example.aithaker.domain.model.Athkar
import com.example.aithaker.domain.model.AthkarCategory

data class HomeState(
    val isLoading: Boolean = false,
    val dailyAthkar: List<Athkar> = emptyList(),
    val categories: List<AthkarCategory> = AthkarCategory.entries,
    val error: String? = null
)
