package com.test.testcmake.main

import androidx.lifecycle.ViewModel
import com.test.nativelib.JNIWrapper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainVM : ViewModel() {
    private val sumCounter = MutableStateFlow(0)

    var counter = sumCounter.asStateFlow()

    init {
        calcCounter(0)
    }

    fun incrementCounter (){
        calcCounter(counter.value + 1)
    }

    private fun calcCounter(s: Int) {
        CoroutineScope(Dispatchers.IO).launch {
            val result = JNIWrapper.getInstance().stringFromJNI(s)
            withContext(Dispatchers.Main){
                sumCounter.value = result
            }
        }
    }
}