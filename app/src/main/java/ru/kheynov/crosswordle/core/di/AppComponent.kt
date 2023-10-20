package ru.kheynov.crosswordle.core.di

import android.app.Application
import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.kheynov.crosswordle.App
import ru.kheynov.crosswordle.MainActivityComponent
import ru.kheynov.crosswordle.featureDaily.di.DailyComponent
import ru.kheynov.crosswordle.featurePractice.di.PracticeComponent
import ru.kheynov.crosswordle.featureProfile.di.ProfileComponent
import javax.inject.Scope

@Scope
annotation class AppScope

@Component(
    modules = [
        NetworkModule::class,
        AppModule::class,
    ]
)
@AppScope
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance app: Application,
            @BindsInstance context: Context,
        ): AppComponent
    }

    fun inject(app: App)


    fun mainActivityComponent(): MainActivityComponent.Factory
    fun dailyScreenComponent(): DailyComponent.Factory
    fun practiceScreenComponent(): PracticeComponent.Factory
    fun profileScreenComponent(): ProfileComponent.Factory
}