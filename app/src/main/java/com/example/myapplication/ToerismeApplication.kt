package com.example.myapplication;

import android.app.Application
import timber.log.Timber

class ToerismeApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }

}