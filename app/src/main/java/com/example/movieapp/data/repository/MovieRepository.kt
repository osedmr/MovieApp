package com.example.movieapp.data.repository

import com.example.movieapp.data.datasource.MovieDatasource
import com.example.movieapp.data.entity.Filmler
import javax.inject.Inject

class MovieRepository @Inject constructor(val mds:MovieDatasource) {

    suspend fun filmleriYukle(): List<Filmler> =mds.filmleriYukle()
}