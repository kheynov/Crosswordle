package ru.kheynov.crosswordle.featureDaily.di

import dagger.Subcomponent
import ru.kheynov.crosswordle.core.di.ViewModelBuilderModule
import ru.kheynov.crosswordle.featureDaily.presentation.DailyFragment
import javax.inject.Scope

@Scope
annotation class DailyScreenScope

@Subcomponent(modules = [DailyModule::class, ViewModelBuilderModule::class])
@DailyScreenScope
interface DailyComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): DailyComponent
    }

    fun inject(fragment: DailyFragment)
}