package com.hweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class HWeatherApplication : Application() {
    companion object {
        const val TOKEN = "yXxVcFhXWs3T4PNc"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}