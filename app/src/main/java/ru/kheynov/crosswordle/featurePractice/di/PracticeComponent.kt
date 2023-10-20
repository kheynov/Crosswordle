package ru.kheynov.crosswordle.featurePractice.di

import dagger.Subcomponent
import ru.kheynov.crosswordle.core.di.ViewModelBuilderModule
import ru.kheynov.crosswordle.featurePractice.presentation.PracticeFragment
import javax.inject.Scope

@Scope
annotation class PracticeScope

@Subcomponent(modules = [PracticeModule::class, ViewModelBuilderModule::class])
@PracticeScope
interface PracticeComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): PracticeComponent
    }

    fun inject(fragment: PracticeFragment)
}