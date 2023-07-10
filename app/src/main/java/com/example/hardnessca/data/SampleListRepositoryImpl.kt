package com.example.hardnessca.data

import com.example.hardnessca.domain.SampleItem
import com.example.hardnessca.domain.SampleListRepository
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class SampleListRepositoryImpl(private val sampleListRepository: SampleListRepository) :
    SampleListRepository {

    override suspend fun addSampleItem(sampleItem: SampleItem) {
        coroutineScope {
            launch {
                sampleListRepository.addSampleItem(sampleItem)
            }
        }
    }

    override suspend fun deleteSampleItem(sampleItem: SampleItem) {
        coroutineScope {
            launch {
                sampleListRepository.deleteSampleItem(sampleItem = sampleItem)
            }
        }
    }


    override suspend fun getSampleList(): List<SampleItem> {
        return coroutineScope {
            async {
                sampleListRepository.getSampleList()
            }.await()
        }
    }

    override suspend fun updateSampleItem(sampleItem: SampleItem) {
        coroutineScope {
            launch {
                sampleListRepository.updateSampleItem(sampleItem = sampleItem)
            }
        }
    }

    override suspend fun getSampleItem(number: String): SampleItem {
        return coroutineScope {
            async {
                sampleListRepository.getSampleItem(number = number)
            }.await()
        }
    }
}