package com.example.aithaker.data.local.dao

import androidx.room.*
import com.example.aithaker.data.local.entity.AthkarEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface AthkarDao {

    @Query("SELECT * FROM athkar ORDER BY orderIndex ASC")
    fun getAllAthkar(): Flow<List<AthkarEntity>>

    @Query("SELECT * FROM athkar WHERE category = :category ORDER BY orderIndex ASC")
    fun getAthkarByCategory(category: String): Flow<List<AthkarEntity>>

    @Query("SELECT * FROM athkar WHERE id = :id")
    suspend fun getAthkarById(id: String): AthkarEntity?

    @Query("SELECT * FROM athkar WHERE isFavorite = 1 ORDER BY orderIndex ASC")
    fun getFavoriteAthkar(): Flow<List<AthkarEntity>>

    @Query("SELECT * FROM athkar WHERE arabicText LIKE '%' || :query || '%' OR translationEn LIKE '%' || :query || '%'")
    fun searchAthkar(query: String): Flow<List<AthkarEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAthkar(athkar: AthkarEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllAthkar(athkarList: List<AthkarEntity>)

    @Update
    suspend fun updateAthkar(athkar: AthkarEntity)

    @Query("UPDATE athkar SET isFavorite = :isFavorite WHERE id = :id")
    suspend fun updateFavoriteStatus(id: String, isFavorite: Boolean)

    @Delete
    suspend fun deleteAthkar(athkar: AthkarEntity)

    @Query("DELETE FROM athkar")
    suspend fun deleteAllAthkar()
}
