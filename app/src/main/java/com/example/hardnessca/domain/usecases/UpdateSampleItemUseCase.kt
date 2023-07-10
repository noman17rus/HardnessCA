package com.example.hardnessca.domain.usecases

import com.example.hardnessca.domain.SampleItem
import com.example.hardnessca.domain.SampleListRepository

class UpdateSampleItemUseCase(private val sampleListRepository: SampleListRepository) {

    suspend fun updateSampleItem(sampleItem: SampleItem) {
        sampleListRepository.updateSampleItem(sampleItem = sampleItem)
    }
}