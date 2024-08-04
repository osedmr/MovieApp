package com.example.movieapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.movieapp.R
import com.example.movieapp.adapters.MovieAdapter
import com.example.movieapp.data.entity.Filmler
import com.example.movieapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding= FragmentHomeBinding.inflate(inflater,container,false)

        binding.toolbarHome.title="Movies Page"

        binding.movieRV.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val movies=ArrayList<Filmler>()
        val f1=Filmler(0,"Django","django",32)
        val f2=Filmler(1,"Interstellar","interstellar",33)
        val f3=Filmler(2,"İnception","inception",34)
        val f4=Filmler(3,"The Hateful Eight","thehatefuleight",35)
        val f5=Filmler(4,"The Pianist","thepianist",36)
        val f6=Filmler(5,"Anadoluda","anadoluda",37)

        movies.add(f1)
        movies.add(f2)
        movies.add(f3)
        movies.add(f4)
        movies.add(f5)
        movies.add(f6)

        val adapter=MovieAdapter(requireContext(),movies)
        binding.movieRV.adapter=adapter
        return binding.root
    }

}