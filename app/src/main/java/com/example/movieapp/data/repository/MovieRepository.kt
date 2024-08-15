package com.example.movieapp.data.repository

import com.example.movieapp.data.datasource.MovieDatasource
import com.example.movieapp.data.entity.Filmler

class MovieRepository {

    val mds = MovieDatasource()
    suspend fun filmleriYukle(): List<Filmler> =mds.filmleriYukle()
}