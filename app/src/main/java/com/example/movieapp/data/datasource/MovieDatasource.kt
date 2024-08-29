package com.example.movieapp.data.datasource

import com.example.movieapp.data.entity.Filmler
import com.example.movieapp.room.FilmlerDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MovieDatasource (var filmlerDao: FilmlerDao){


    suspend fun filmleriYukle(): List<Filmler> {
        return withContext(Dispatchers.IO) {
            return@withContext filmlerDao.filmleryukle()
        }
    }
}