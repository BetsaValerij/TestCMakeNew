package com.test.nativelib

class JNIWrapper {

    /**
     * A native method that is implemented by the 'wrapper' native library,
     * which is packaged with this application.
     */
external fun stringFromJNI(value: Int): Int

    companion object {
        // Used to load the 'wrapper' library on application startup.
        init {
            System.loadLibrary("wrapper")
        }
        @Volatile private var instance: JNIWrapper? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: JNIWrapper().also { instance = it }
            }
    }
}