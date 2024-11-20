package com.yogesh.koindependencyinjection.bind_binds_example

import android.util.Log
import com.yogesh.koindependencyinjection.utils.TAG

interface AppDeveloper {
    fun writeCode()
    fun debugCode()
}

class AppDeveloperImpl : AppDeveloper {
    override fun writeCode() {
        Log.d(TAG, "writeCode")
    }

    override fun debugCode() {
        Log.d(TAG, "debugCode")
    }
}

class Engineer(val appDeveloper: AppDeveloper) {
    fun writeCode() {
        appDeveloper.writeCode()
    }

    fun debugCode() {
        appDeveloper.debugCode()
    }
}