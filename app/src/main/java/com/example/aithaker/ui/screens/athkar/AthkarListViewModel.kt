package com.example.aithaker.ui.screens.athkar

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.aithaker.domain.model.AthkarCategory
import com.example.aithaker.domain.usecase.GetAthkarByCategoryUseCase
import com.example.aithaker.domain.usecase.ToggleFavoriteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AthkarListViewModel @Inject constructor(
    private val getAthkarByCategoryUseCase: GetAthkarByCategoryUseCase,
    private val toggleFavoriteUseCase: ToggleFavoriteUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _state = MutableStateFlow(AthkarListState())
    val state: StateFlow<AthkarListState> = _state.asStateFlow()

    init {
        val categoryName = savedStateHandle.get<String>("category") ?: "MORNING"
        loadAthkarByCategory(categoryName)
    }

    private fun loadAthkarByCategory(categoryName: String) {
        viewModelScope.launch {
            _state.update { it.copy(isLoading = true, error = null, categoryName = categoryName) }

            try {
                val category = AthkarCategory.valueOf(categoryName)
                getAthkarByCategoryUseCase(category)
                    .catch { error ->
                        _state.update {
                            it.copy(
                                isLoading = false,
                                error = error.message ?: "خطأ غير معروف"
                            )
                        }
                    }
                    .collect { athkarList ->
                        _state.update {
                            it.copy(
                                isLoading = false,
                                athkarList = athkarList
                            )
                        }
                    }
            } catch (e: Exception) {
                _state.update {
                    it.copy(
                        isLoading = false,
                        error = "فئة غير صحيحة"
                    )
                }
            }
        }
    }

    fun toggleFavorite(athkarId: String, isFavorite: Boolean) {
        viewModelScope.launch {
            toggleFavoriteUseCase(athkarId, !isFavorite)
        }
    }
}
