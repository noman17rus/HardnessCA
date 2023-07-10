package com.example.hardnessca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.room.Room
import com.example.hardnessca.data.SampleItemRoomDB
import com.example.hardnessca.data.SampleListRepositoryImpl

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val dao = Room.databaseBuilder(this, SampleItemRoomDB::class.java, "SampleItems").build().getDao()
            val dataRoom = SampleListRepositoryImpl(dao)
        }
    }
}


