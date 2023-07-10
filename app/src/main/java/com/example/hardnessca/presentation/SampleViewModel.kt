package com.example.hardnessca.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hardnessca.domain.SampleItem
import com.example.hardnessca.domain.SampleListRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SampleViewModel(private val dataBase: SampleListRepository) : ViewModel() {

    private val _listOfSamples = MutableLiveData<List<SampleItem>>()
    val listOfSamples: LiveData<List<SampleItem>> = _listOfSamples

    private fun getSampleList() {
        viewModelScope.launch(Dispatchers.Main) {
            _listOfSamples.value = dataBase.getSampleList()
        }
    }
    fun addSampleItem(sampleItem: SampleItem) {
        viewModelScope.launch {
            dataBase.addSampleItem(sampleItem = sampleItem)
            getSampleList()
        }
    }

    fun deleteSampleItem(sampleItem: SampleItem) {
        viewModelScope.launch {
            dataBase.deleteSampleItem(sampleItem = sampleItem)
            getSampleList()
        }
    }

    fun updateSampleItem(sampleItem: SampleItem) {
        viewModelScope.launch {
            dataBase.updateSampleItem(sampleItem = sampleItem)
            getSampleList()
        }
    }
}