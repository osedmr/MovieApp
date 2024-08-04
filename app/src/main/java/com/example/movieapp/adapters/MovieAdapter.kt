package com.example.movieapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.R
import com.example.movieapp.data.entity.Filmler
import com.example.movieapp.databinding.MovieCartviewBinding
import com.example.movieapp.fragments.HomeFragmentDirections

class MovieAdapter(var mContext:Context,var movieList: List<Filmler>):RecyclerView.Adapter<MovieAdapter.MovieCartHolder>() {

    inner class MovieCartHolder(var binding: MovieCartviewBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieCartHolder {
        val binding=MovieCartviewBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return MovieCartHolder(binding)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieCartHolder, position: Int) {
        val film=movieList[position]
        holder.binding.movieImage.setImageResource(mContext.resources.getIdentifier(film.resim,"drawable",mContext.packageName))
        holder.binding.priceText.text="${film.price} $"



        holder.binding.movieCardView.setOnClickListener {
            val gecis=HomeFragmentDirections.homeToDetails(film)
            Navigation.findNavController(it).navigate(gecis)
        }
    }
}