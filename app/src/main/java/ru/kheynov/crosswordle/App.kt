package ru.kheynov.crosswordle

import android.app.Application
import android.content.Context
import ru.kheynov.crosswordle.core.di.AppComponent
import ru.kheynov.crosswordle.core.di.DaggerAppComponent

class App : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        appComponent = DaggerAppComponent.factory().create(
            this,
            applicationContext
        )
        appComponent.inject(this)
        super.onCreate()
    }
}

val Context.appComponent: AppComponent
    get() = when (this) {
        is App -> appComponent
        else -> (this.applicationContext as App).appComponent
    }