package ru.kheynov.crosswordle.featureProfile.di

import dagger.Subcomponent
import ru.kheynov.crosswordle.core.di.ViewModelBuilderModule
import ru.kheynov.crosswordle.featureProfile.presentation.ProfileFragment
import javax.inject.Scope

@Scope
annotation class ProfileScope

@Subcomponent(modules = [ProfileModule::class, ViewModelBuilderModule::class])
@ProfileScope
interface ProfileComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): ProfileComponent
    }

    fun inject(fragment: ProfileFragment)
}