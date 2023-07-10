package com.example.hardnessca.domain.usecases

import com.example.hardnessca.domain.SampleItem
import com.example.hardnessca.domain.SampleListRepository

class AddSampleItemUseCase(private val sampleListRepository: SampleListRepository) {

    suspend fun addSampleItem(sampleItem: SampleItem) {
        sampleListRepository.addSampleItem(sampleItem)
    }
}