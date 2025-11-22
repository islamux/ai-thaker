package com.example.aithaker.ui.screens.detail

import com.example.aithaker.domain.model.Athkar

data class AthkarDetailState(
    val isLoading: Boolean = false,
    val athkar: Athkar? = null,
    val currentCount: Int = 0,
    val error: String? = null
)
