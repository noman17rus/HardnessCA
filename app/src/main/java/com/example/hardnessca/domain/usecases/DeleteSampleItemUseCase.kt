package com.example.hardnessca.domain.usecases

import com.example.hardnessca.domain.SampleItem
import com.example.hardnessca.domain.SampleListRepository

class DeleteSampleItemUseCase(private val sampleListRepository: SampleListRepository) {

    suspend fun deleteSampleItem(sampleItem: SampleItem) {
        sampleListRepository.deleteSampleItem(sampleItem = sampleItem)
    }
}