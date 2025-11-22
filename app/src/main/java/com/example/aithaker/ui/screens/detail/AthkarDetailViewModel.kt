package com.example.aithaker.ui.screens.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.aithaker.domain.repository.AthkarRepository
import com.example.aithaker.domain.usecase.ToggleFavoriteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AthkarDetailViewModel @Inject constructor(
    private val repository: AthkarRepository,
    private val toggleFavoriteUseCase: ToggleFavoriteUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _state = MutableStateFlow(AthkarDetailState())
    val state: StateFlow<AthkarDetailState> = _state.asStateFlow()

    init {
        val athkarId = savedStateHandle.get<String>("athkarId") ?: ""
        loadAthkar(athkarId)
    }

    private fun loadAthkar(athkarId: String) {
        viewModelScope.launch {
            _state.update { it.copy(isLoading = true, error = null) }

            repository.getAthkarById(athkarId)
                .onSuccess { athkar ->
                    _state.update {
                        it.copy(
                            isLoading = false,
                            athkar = athkar,
                            currentCount = 0
                        )
                    }
                }
                .onFailure { error ->
                    _state.update {
                        it.copy(
                            isLoading = false,
                            error = error.message ?: "خطأ في تحميل الذكر"
                        )
                    }
                }
        }
    }

    fun incrementCount() {
        _state.update { 
            it.copy(
                currentCount = (it.currentCount + 1).coerceAtMost(it.athkar?.repeatCount ?: 0)
            )
        }
    }

    fun resetCount() {
        _state.update { it.copy(currentCount = 0) }
    }

    fun toggleFavorite() {
        val athkar = _state.value.athkar ?: return
        viewModelScope.launch {
            toggleFavoriteUseCase(athkar.id, athkar.isFavorite)
        }
    }
}
