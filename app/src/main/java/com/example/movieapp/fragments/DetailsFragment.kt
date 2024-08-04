package com.example.movieapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.movieapp.R
import com.example.movieapp.databinding.FragmentDetailsBinding


class DetailsFragment : Fragment() {

    private lateinit var binding: FragmentDetailsBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding= FragmentDetailsBinding.inflate(inflater,container,false)


        val bundle:DetailsFragmentArgs by navArgs()
        val film=bundle.film
        binding.toolbar.title=film.name
        binding.movieImage.setImageResource(resources.getIdentifier(film.resim,"drawable",requireContext().packageName) )
        binding.moviePrice.text="${film.price} $"
        return binding.root
    }


}