package com.yogesh.koindependencyinjection

import android.app.Application
import com.yogesh.koindependencyinjection.di.classModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApp)
            modules(classModule)
        }
    }

}