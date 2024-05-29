package com.test.testcmake

import android.app.Application
import com.test.nativelib.JNIWrapper

class AppApplication : Application() {
    init {
        JNIWrapper.getInstance()
    }
}