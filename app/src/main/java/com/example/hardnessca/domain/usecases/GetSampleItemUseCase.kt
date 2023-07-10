package com.example.hardnessca.domain.usecases

import com.example.hardnessca.domain.SampleItem
import com.example.hardnessca.domain.SampleListRepository

class GetSampleItemUseCase(private val sampleListRepository: SampleListRepository) {

    suspend fun getSampleItem(number: String): SampleItem {
        return sampleListRepository.getSampleItem(number)
    }
}