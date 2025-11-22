package com.example.aithaker.ui.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.aithaker.domain.usecase.GetDailyAthkarUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getDailyAthkarUseCase: GetDailyAthkarUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(HomeState())
    val state: StateFlow<HomeState> = _state.asStateFlow()

    init {
        loadDailyAthkar()
    }

    private fun loadDailyAthkar() {
        viewModelScope.launch {
            _state.update { it.copy(isLoading = true, error = null) }

            getDailyAthkarUseCase()
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
                            dailyAthkar = athkarList
                        )
                    }
                }
        }
    }

    fun refresh() {
        loadDailyAthkar()
    }
}
