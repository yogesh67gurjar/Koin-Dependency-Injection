package com.yogesh.koindependencyinjection

import android.app.Application
import com.yogesh.koindependencyinjection.di.bindBindsModule
import com.yogesh.koindependencyinjection.di.classModule
import com.yogesh.koindependencyinjection.di.interfaceModule
import com.yogesh.koindependencyinjection.di.qualifiersModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApp)
            modules(classModule, interfaceModule, qualifiersModule, bindBindsModule)
        }
    }

}