package com.yogesh.koindependencyinjection.interface_dependency_injection

import android.util.Log
import com.yogesh.koindependencyinjection.utils.TAG

interface TwoWheeler {
    fun start()
    fun stop()
}

class TwoWheelerImpl : TwoWheeler {
    override fun start() {
        Log.d(TAG, "start: ")
    }

    override fun stop() {
        Log.d(TAG, "stop: ")
    }
}