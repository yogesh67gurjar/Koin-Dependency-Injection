package com.yogesh.koindependencyinjection.di

import android.graphics.ColorSpace
import com.yogesh.koindependencyinjection.class_dependency_injection.Car
import com.yogesh.koindependencyinjection.class_dependency_injection.Engine
import com.yogesh.koindependencyinjection.class_dependency_injection.Wheel
import com.yogesh.koindependencyinjection.interface_dependency_injection.TwoWheeler
import com.yogesh.koindependencyinjection.interface_dependency_injection.TwoWheelerImpl
import org.koin.core.qualifier.named
import org.koin.dsl.module

val classModule = module {
    single { Engine() }
    single { Wheel() }
    factory { Car(engine = get(), wheel = get()) }
}

val interfaceModule = module {
    //    factory { TwoWheelerImpl() as TwoWheeler }
    factory<TwoWheeler> { TwoWheelerImpl() }
    //    factory { TwoWheelerImpl() } bind TwoWheeler::class
}

val BASE_URL_ONE = "ONE"
val BASE_URL_TWO = "TWO"

val qualifiersModule = module {
    single<String>(named(BASE_URL_ONE)) {
        "www.abc.com"
    }

    single<String>(named(BASE_URL_TWO)) {
        "www.xyz.com"
    }
}