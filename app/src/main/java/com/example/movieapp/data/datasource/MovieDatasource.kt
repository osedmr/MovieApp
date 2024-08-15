package com.example.movieapp.data.datasource

import com.example.movieapp.data.entity.Filmler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MovieDatasource {


    suspend fun filmleriYukle(): List<Filmler> {
        return withContext(Dispatchers.IO) {
            val movies = ArrayList<Filmler>()
            val f1 = Filmler(0, "Django", "django", 32)
            val f2 = Filmler(1, "Interstellar", "interstellar", 33)
            val f3 = Filmler(2, "İnception", "inception", 34)
            val f4 = Filmler(3, "The Hateful Eight", "thehatefuleight", 35)
            val f5 = Filmler(4, "The Pianist", "thepianist", 36)
            val f6 = Filmler(5, "Anadoluda", "anadoluda", 37)

            movies.add(f1)
            movies.add(f2)
            movies.add(f3)
            movies.add(f4)
            movies.add(f5)
            movies.add(f6)
            return@withContext movies
        }
    }
}