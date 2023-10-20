package ru.kheynov.crosswordle.featurePractice.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.kheynov.crosswordle.core.di.ViewModelKey
import ru.kheynov.crosswordle.featurePractice.presentation.PracticeScreenViewModel

@Module
interface PracticeModule {
    @Binds
    @IntoMap
    @ViewModelKey(PracticeScreenViewModel::class)
    fun bindViewModel(viewModel: PracticeScreenViewModel): ViewModel
}