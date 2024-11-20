package com.yogesh.koindependencyinjection.di

import android.graphics.ColorSpace
import com.yogesh.koindependencyinjection.bind_binds_example.AppDeveloper
import com.yogesh.koindependencyinjection.bind_binds_example.AppDeveloperImpl
import com.yogesh.koindependencyinjection.bind_binds_example.Engineer
import com.yogesh.koindependencyinjection.bind_binds_example.Singer
import com.yogesh.koindependencyinjection.bind_binds_example.SingerImpl
import com.yogesh.koindependencyinjection.bind_binds_example.Student
import com.yogesh.koindependencyinjection.bind_binds_example.StudentImpl
import com.yogesh.koindependencyinjection.bind_binds_example.StudentSingerImpl
import com.yogesh.koindependencyinjection.bind_binds_example.StudentWhoSings
import com.yogesh.koindependencyinjection.class_dependency_injection.Car
import com.yogesh.koindependencyinjection.class_dependency_injection.Engine
import com.yogesh.koindependencyinjection.class_dependency_injection.Wheel
import com.yogesh.koindependencyinjection.interface_dependency_injection.TwoWheeler
import com.yogesh.koindependencyinjection.interface_dependency_injection.TwoWheelerImpl
import org.koin.core.qualifier.named
import org.koin.dsl.bind
import org.koin.dsl.binds
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

val bindBindsModule = module {
    single { AppDeveloperImpl() } bind AppDeveloper::class  // we are passing AppDevImpl as AppDev
    factory { Engineer(appDeveloper = get()) }

    single { StudentSingerImpl() } binds arrayOf(Student::class, Singer::class)
    factory { StudentWhoSings(student = get(), singer = get()) }
}