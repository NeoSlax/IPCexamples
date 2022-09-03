package com.andreibelous.ipcexamples

import android.app.Application
import android.util.Log

class MyApp : Application() {
    private val TAG = this::class.java.name
    override fun onCreate() {
        super.onCreate()
        tag()
    }
}

fun Any.tag() {
    val TAG = this::class.java.name
    Log.e(TAG, "Thread is ${Thread.currentThread().name}")
}