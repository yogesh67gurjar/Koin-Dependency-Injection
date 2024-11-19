package com.yogesh.koindependencyinjection.class_dependency_injection

import android.util.Log
import com.yogesh.koindependencyinjection.utils.TAG

class Wheel {
    fun startWheel() {
        Log.d(TAG, "startWheel")
    }

    fun stopWheel() {
        Log.d(TAG, "stopWheel")
    }
}