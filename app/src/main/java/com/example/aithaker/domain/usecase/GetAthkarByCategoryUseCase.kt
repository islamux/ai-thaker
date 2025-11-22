package com.example.aithaker.domain.usecase

import com.example.aithaker.domain.model.Athkar
import com.example.aithaker.domain.model.AthkarCategory
import com.example.aithaker.domain.repository.AthkarRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAthkarByCategoryUseCase @Inject constructor(
    private val repository: AthkarRepository
) {
    operator fun invoke(category: AthkarCategory): Flow<List<Athkar>> {
        return repository.getAthkarByCategory(category)
    }
}
