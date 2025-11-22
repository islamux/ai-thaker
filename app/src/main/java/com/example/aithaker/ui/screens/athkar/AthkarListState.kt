package com.example.aithaker.ui.screens.athkar

import com.example.aithaker.domain.model.Athkar

data class AthkarListState(
    val isLoading: Boolean = false,
    val athkarList: List<Athkar> = emptyList(),
    val categoryName: String = "",
    val error: String? = null
)
