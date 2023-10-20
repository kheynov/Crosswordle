package ru.kheynov.crosswordle

import dagger.Subcomponent
import javax.inject.Scope

@Scope
annotation class MainActivityScope

@Subcomponent
@MainActivityScope
interface MainActivityComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): MainActivityComponent
    }

    fun inject(activity: MainActivity)
}