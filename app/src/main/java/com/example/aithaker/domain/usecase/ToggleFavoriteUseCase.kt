package com.example.aithaker.domain.usecase

import com.example.aithaker.domain.repository.AthkarRepository
import javax.inject.Inject

class ToggleFavoriteUseCase @Inject constructor(
    private val repository: AthkarRepository
) {
    suspend operator fun invoke(athkarId: String, isFavorite: Boolean): Result<Unit> {
        return repository.toggleFavorite(athkarId, isFavorite)
    }
}
