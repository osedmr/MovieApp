package com.example.movieapp.di

import android.content.Context
import androidx.room.Room
import com.example.movieapp.data.datasource.MovieDatasource
import com.example.movieapp.data.repository.MovieRepository
import com.example.movieapp.room.AppDatabase
import com.example.movieapp.room.FilmlerDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideMovieDatasource(fdao:FilmlerDao): MovieDatasource{
        return MovieDatasource(fdao)
    }

    @Provides
    @Singleton
    fun provideMovieRepository(mds:MovieDatasource): MovieRepository {
        return MovieRepository(mds)
    }

    @Provides
    @Singleton
    fun provideFilmlerDao(@ApplicationContext context: Context): FilmlerDao {
        val dp= Room.databaseBuilder(context, AppDatabase::class.java,"filmler_app.sqlite")
            .createFromAsset("filmler_app.sqlite").build()
        return dp.filmlerDao()

    }
}