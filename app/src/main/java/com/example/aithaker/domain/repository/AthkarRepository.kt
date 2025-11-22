package com.example.aithaker.domain.repository

import com.example.aithaker.domain.model.Athkar
import com.example.aithaker.domain.model.AthkarCategory
import kotlinx.coroutines.flow.Flow

interface AthkarRepository {

    /**
     * Get all Athkar as a Flow
     */
    fun getAllAthkar(): Flow<List<Athkar>>

    /**
     * Get Athkar by category
     */
    fun getAthkarByCategory(category: AthkarCategory): Flow<List<Athkar>>

    /**
     * Get a single Athkar by ID
     */
    suspend fun getAthkarById(id: String): Result<Athkar>

    /**
     * Get all favorite Athkar
     */
    fun getFavoriteAthkar(): Flow<List<Athkar>>

    /**
     * Search Athkar by query
     */
    fun searchAthkar(query: String): Flow<List<Athkar>>

    /**
     * Toggle favorite status
     */
    suspend fun toggleFavorite(id: String, isFavorite: Boolean): Result<Unit>

    /**
     * Add new Athkar
     */
    suspend fun addAthkar(athkar: Athkar): Result<Unit>

    /**
     * Update existing Athkar
     */
    suspend fun updateAthkar(athkar: Athkar): Result<Unit>

    /**
     * Delete Athkar
     */
    suspend fun deleteAthkar(athkar: Athkar): Result<Unit>
}
