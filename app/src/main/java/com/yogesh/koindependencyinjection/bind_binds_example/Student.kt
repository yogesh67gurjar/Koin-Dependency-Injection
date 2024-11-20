package com.yogesh.koindependencyinjection.bind_binds_example

import android.util.Log
import com.yogesh.koindependencyinjection.utils.TAG

interface Student {
    fun doStudy()
    fun doRevision()
}

class StudentImpl : Student {
    override fun doStudy() {
        Log.d(TAG, "doStudy")
    }

    override fun doRevision() {
        Log.d(TAG, "doRevision")
    }
}

interface Singer {
    fun playGuitar()
    fun singSong()
}

class SingerImpl : Singer {
    override fun playGuitar() {
        Log.d(TAG, "playGuitar")
    }

    override fun singSong() {
        Log.d(TAG, "singSong")
    }
}

class StudentSingerImpl : Student, Singer {
    override fun doStudy() {
        Log.d(TAG, "doStudy")
    }

    override fun doRevision() {
        Log.d(TAG, "doRevision")
    }

    override fun playGuitar() {
        Log.d(TAG, "playGuitar")
    }

    override fun singSong() {
        Log.d(TAG, "singSong")
    }
}

class StudentWhoSings(val student: Student, val singer: Singer) {
    fun doStudy() {
        student.doStudy()
    }

    fun doRevision() {
        student.doRevision()
    }

    fun playGuitar() {
        singer.playGuitar()
    }

    fun singSong() {
        singer.singSong()
    }
}