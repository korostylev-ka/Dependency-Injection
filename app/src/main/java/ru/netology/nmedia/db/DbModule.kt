package ru.netology.nmedia.db

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ru.netology.nmedia.dao.PostDao
import javax.inject.Singleton

//@InstallIn - на уровне приложения
@InstallIn(SingletonComponent::class)
@Module
class DbModule {
    //@Provides - хотим вручную создать экземпляр объекта
    @Provides
    //@Singleton - объект живет в рамках всего приложения, в единственном экземпляре
    @Singleton
    fun provideDb(
        @ApplicationContext
        context: Context
    ): AppDb = Room.databaseBuilder(context, AppDb::class.java, "app.db")
        .fallbackToDestructiveMigration()
        .build()


    @Provides
    fun providePostDao(
        appDb: AppDb
    ): PostDao = appDb.postDao()

}