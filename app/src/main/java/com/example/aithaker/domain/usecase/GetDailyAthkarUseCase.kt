package com.example.aithaker.domain.usecase

import com.example.aithaker.domain.model.Athkar
import com.example.aithaker.domain.model.AthkarCategory
import com.example.aithaker.domain.repository.AthkarRepository
import kotlinx.coroutines.flow.Flow
import java.time.LocalTime
import javax.inject.Inject

class GetDailyAthkarUseCase @Inject constructor(
    private val repository: AthkarRepository
) {
    /**
     * Get appropriate daily Athkar based on current time
     * Returns morning Athkar before noon, evening Athkar after
     */
    operator fun invoke(): Flow<List<Athkar>> {
        val currentHour = LocalTime.now().hour
        val category = if (currentHour < 12) {
            AthkarCategory.MORNING
        } else {
            AthkarCategory.EVENING
        }

        return repository.getAthkarByCategory(category)
    }
}
