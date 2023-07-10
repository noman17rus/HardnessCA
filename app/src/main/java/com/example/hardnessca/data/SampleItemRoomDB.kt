package com.example.hardnessca.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.hardnessca.domain.SampleItem
import com.example.hardnessca.domain.SampleListRepository

@Database(entities = [SampleItem::class], version = 1)
abstract class SampleItemRoomDB : RoomDatabase() {
    abstract fun getDao(): SampleListRepository
}