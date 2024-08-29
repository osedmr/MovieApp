package com.example.movieapp.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.movieapp.data.entity.Filmler

@Database(entities=[Filmler::class],version=1)
abstract class AppDatabase :RoomDatabase() {
    abstract fun filmlerDao(): FilmlerDao

}