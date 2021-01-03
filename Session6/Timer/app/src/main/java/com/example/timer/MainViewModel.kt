package com.example.timer

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import timber.log.Timber

class MainViewModel : ViewModel() {

    private val secondsPrivate = MutableLiveData<String>()

    val seconds : LiveData<String>
        get() = secondsPrivate

    init {
        val secondLimit = 36_00_000

        viewModelScope.launch {
            for (sec in 1..secondLimit){
                delay(1000)

                secondsPrivate.value = String.format(
                    "%02d:%02d",
                    (sec/60)%60,
                    sec%60
                )

            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        Timber.i("onCleared called")
    }
}