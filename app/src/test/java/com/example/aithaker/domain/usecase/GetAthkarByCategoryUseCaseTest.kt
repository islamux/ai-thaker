package com.example.aithaker.domain.usecase

import app.cash.turbine.test
import com.example.aithaker.domain.model.Athkar
import com.example.aithaker.domain.model.AthkarCategory
import com.example.aithaker.domain.repository.AthkarRepository
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class GetAthkarByCategoryUseCaseTest {

    private lateinit var repository: AthkarRepository
    private lateinit var useCase: GetAthkarByCategoryUseCase

    @Before
    fun setup() {
        repository = mockk()
        useCase = GetAthkarByCategoryUseCase(repository)
    }

    @Test
    fun `invoke returns athkar for given category`() = runTest {
        // Given
        val category = AthkarCategory.MORNING
        val expectedAthkar = listOf(
            createTestAthkar(id = "1", category = AthkarCategory.MORNING),
            createTestAthkar(id = "2", category = AthkarCategory.MORNING)
        )
        every { repository.getAthkarByCategory(category) } returns flowOf(expectedAthkar)

        // When
        val result = useCase(category)

        // Then
        result.test {
            val items = awaitItem()
            assertEquals(2, items.size)
            assertEquals(AthkarCategory.MORNING, items[0].category)
            assertEquals(AthkarCategory.MORNING, items[1].category)
            awaitComplete()
        }
    }

    @Test
    fun `invoke returns empty list when no athkar in category`() = runTest {
        // Given
        val category = AthkarCategory.SLEEPING
        every { repository.getAthkarByCategory(category) } returns flowOf(emptyList())

        // When
        val result = useCase(category)

        // Then
        result.test {
            val items = awaitItem()
            assertEquals(0, items.size)
            awaitComplete()
        }
    }

    private fun createTestAthkar(
        id: String = "test_id",
        category: AthkarCategory = AthkarCategory.MORNING
    ) = Athkar(
        id = id,
        arabicText = "Test Arabic Text",
        translationEn = "Test English Translation",
        category = category,
        repeatCount = 1,
        isFavorite = false,
        orderIndex = 0
    )
}
