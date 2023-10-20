package ru.kheynov.crosswordle.featureProfile.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.kheynov.crosswordle.core.di.ViewModelKey
import ru.kheynov.crosswordle.featureProfile.presentation.ProfileViewModel

@Module
interface ProfileModule {
    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel::class)
    fun bindViewModel(viewModel: ProfileViewModel): ViewModel
}