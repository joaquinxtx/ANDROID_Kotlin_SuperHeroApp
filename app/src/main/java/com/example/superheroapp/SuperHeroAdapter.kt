package com.example.superheroapp

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SuperHeroAdapter(val superHeroList: List<SuperheroItemResponse> = emptyList()) :
    RecyclerView.Adapter<SuperHeroViewHolder> {
    override fun getItemCount()=superHeroList.size

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {

        holder.bind(superHeroList[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {

    }
}