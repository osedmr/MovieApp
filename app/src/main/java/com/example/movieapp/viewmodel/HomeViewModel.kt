package com.example.movieapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.movieapp.data.entity.Filmler
import com.example.movieapp.data.repository.MovieRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel:ViewModel() {

    val filmlerListesi= MutableLiveData<List<Filmler>>()
    val movieRepo= MovieRepository()

    init {
        filmleriYukle()
    }


    fun filmleriYukle(){
        CoroutineScope(Dispatchers.Main).launch {
            filmlerListesi.value=movieRepo.filmleriYukle()
        }
    }
}