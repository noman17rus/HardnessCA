package com.example.hardnessca.domain

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import androidx.room.Upsert

@Dao
interface SampleListRepository {
    @Query("SELECT * FROM SampleItem")
    suspend fun getSampleList(): List<SampleItem>
    @Query("SELECT * FROM SampleItem WHERE number = :number")
    suspend fun getSampleItem(number: String) : SampleItem
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addSampleItem(sampleItem: SampleItem)
    @Delete
    suspend fun deleteSampleItem(sampleItem: SampleItem)
    @Update
    suspend fun updateSampleItem(sampleItem: SampleItem)

}