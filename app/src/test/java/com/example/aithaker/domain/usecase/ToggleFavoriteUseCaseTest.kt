package com.example.aithaker.domain.usecase

import app.cash.turbine.test
import com.example.aithaker.domain.model.Athkar
import com.example.aithaker.domain.model.AthkarCategory
import com.example.aithaker.domain.repository.AthkarRepository
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class ToggleFavoriteUseCaseTest {

    private lateinit var repository: AthkarRepository
    private lateinit var useCase: ToggleFavoriteUseCase

    @Before
    fun setup() {
        repository = mockk()
        useCase = ToggleFavoriteUseCase(repository)
    }

    @Test
    fun `invoke calls repository toggleFavorite with correct parameters`() = runTest {
        // Given
        val athkarId = "test_id"
        val isFavorite = true
        coEvery { repository.toggleFavorite(athkarId, isFavorite) } returns Result.success(Unit)

        // When
        val result = useCase(athkarId, isFavorite)

        // Then
        assertTrue(result.isSuccess)
        coVerify(exactly = 1) { repository.toggleFavorite(athkarId, isFavorite) }
    }

    @Test
    fun `invoke returns failure when repository fails`() = runTest {
        // Given
        val athkarId = "test_id"
        val isFavorite = false
        val error = Exception("Database error")
        coEvery { repository.toggleFavorite(athkarId, isFavorite) } returns Result.failure(error)

        // When
        val result = useCase(athkarId, isFavorite)

        // Then
        assertTrue(result.isFailure)
        assertEquals(error, result.exceptionOrNull())
    }
}
