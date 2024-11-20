package com.yogesh.koindependencyinjection.viewmodel_example

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private var _countLiveData: MutableLiveData<Int> = MutableLiveData(0)
    var countLiveData: LiveData<Int> = _countLiveData

    fun plusOne() {
        _countLiveData.value?.plus(1)
    }
}