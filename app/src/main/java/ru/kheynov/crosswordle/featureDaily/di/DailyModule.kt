package ru.kheynov.crosswordle.featureDaily.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.kheynov.crosswordle.core.di.ViewModelKey
import ru.kheynov.crosswordle.featureDaily.presentation.DailyScreenViewModel

@Module
interface DailyModule {
    @Binds
    @IntoMap
    @ViewModelKey(DailyScreenViewModel::class)
    fun bindViewModel(viewModel: DailyScreenViewModel): ViewModel
}