package com.yogesh.koindependencyinjection.di

import com.yogesh.koindependencyinjection.class_dependency_injection.Car
import com.yogesh.koindependencyinjection.class_dependency_injection.Engine
import com.yogesh.koindependencyinjection.class_dependency_injection.Wheel
import org.koin.dsl.module

val classModule = module {
    single { Engine() }
    single { Wheel() }
    factory { Car(engine = get(), wheel = get()) }
}