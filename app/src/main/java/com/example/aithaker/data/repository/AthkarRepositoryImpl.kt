package com.example.aithaker.data.repository

import com.example.aithaker.data.local.dao.AthkarDao
import com.example.aithaker.data.mapper.toDomain
import com.example.aithaker.data.mapper.toEntity
import com.example.aithaker.domain.model.Athkar
import com.example.aithaker.domain.model.AthkarCategory
import com.example.aithaker.domain.repository.AthkarRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class AthkarRepositoryImpl @Inject constructor(
    private val athkarDao: AthkarDao
) : AthkarRepository {

    override fun getAllAthkar(): Flow<List<Athkar>> {
        return athkarDao.getAllAthkar()
            .map { entities -> entities.map { it.toDomain() } }
    }

    override fun getAthkarByCategory(category: AthkarCategory): Flow<List<Athkar>> {
        return athkarDao.getAthkarByCategory(category.name)
            .map { entities -> entities.map { it.toDomain() } }
    }

    override suspend fun getAthkarById(id: String): Result<Athkar> {
        return try {
            val entity = athkarDao.getAthkarById(id)
            if (entity != null) {
                Result.success(entity.toDomain())
            } else {
                Result.failure(NoSuchElementException("Athkar not found"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    override fun getFavoriteAthkar(): Flow<List<Athkar>> {
        return athkarDao.getFavoriteAthkar()
            .map { entities -> entities.map { it.toDomain() } }
    }

    override fun searchAthkar(query: String): Flow<List<Athkar>> {
        return athkarDao.searchAthkar(query)
            .map { entities -> entities.map { it.toDomain() } }
    }

    override suspend fun toggleFavorite(id: String, isFavorite: Boolean): Result<Unit> {
        return try {
            athkarDao.updateFavoriteStatus(id, isFavorite)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    override suspend fun addAthkar(athkar: Athkar): Result<Unit> {
        return try {
            athkarDao.insertAthkar(athkar.toEntity())
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    override suspend fun updateAthkar(athkar: Athkar): Result<Unit> {
        return try {
            athkarDao.updateAthkar(athkar.toEntity())
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    override suspend fun deleteAthkar(athkar: Athkar): Result<Unit> {
        return try {
            athkarDao.deleteAthkar(athkar.toEntity())
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
