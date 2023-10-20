package ru.kheynov.crosswordle.core.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.net.ConnectivityManager
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.Reusable
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import retrofit2.Retrofit

@OptIn(ExperimentalSerializationApi::class)
@Module
interface AppModule {
    companion object {

        @Provides
        fun provideJsonSerializer(): Json = Json {
            ignoreUnknownKeys = true
            explicitNulls = false
        }

//        @Provides
//        @AppScope
//        fun provideSharedPreferences(
//            app: Application,
//        ): SharedPreferences =
//            app.getSharedPreferences("SHARED_PREFS", Context.MODE_PRIVATE)
//
//        @Provides
//        @Reusable
//        fun provideConnectivityManager(context: Context) =
//            context.getSystemService(ConnectivityManager::class.java) as ConnectivityManager
//
//        @Provides
//        @AppScope
//        fun provideTodoDatabase(app: Application): TodoLocalDatabase =
//            Room.databaseBuilder(
//                app,
//                TodoLocalDatabase::class.java,
//                TodoLocalDatabase.DATABASE_NAME
//            ).build()
//
//        @Provides
//        @AppScope
//        fun provideRepository(
//            dao: TodoLocalDAO,
//            remote: RemoteDataSource,
//        ): TodoItemsRepository = TodoRepositoryImpl(
//            localDataSource = dao,
//            remoteDataSource = remote
//        )
//
//        @Provides
//        @AppScope
//        fun provideLocalDao(
//            db: TodoLocalDatabase,
//        ): TodoLocalDAO = db.dao
    }
}