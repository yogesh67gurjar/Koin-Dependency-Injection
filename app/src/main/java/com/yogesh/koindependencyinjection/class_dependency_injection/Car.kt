package com.yogesh.koindependencyinjection.class_dependency_injection

class Car(val engine: Engine, val wheel: Wheel) {
    fun startTrip() {
        engine.startEngine()
        wheel.startWheel()
    }

    fun endTrip() {
        wheel.stopWheel()
        engine.stopEngine()
    }
}