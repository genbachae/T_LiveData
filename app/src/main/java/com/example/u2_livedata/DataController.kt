package com.example.u2_livedata

import androidx.lifecycle.LiveData

import androidx.lifecycle.MutableLiveData
import java.util.*


object DataController {                                 //  это синглтон!
    private val liveData = MutableLiveData<String>()

    fun getData(): LiveData<String>? {
        return liveData
    }

    fun getCurrentDateTime(): Date {
        return Calendar.getInstance().time
    }

    fun refresh(){
        val date = getCurrentDateTime()
        val dateInString = date.toString()
        liveData.value = dateInString
    }
}