package com.aortega.recyclerviewup.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.aortega.recyclerviewup.SuperHero
import com.aortega.recyclerviewup.databinding.ItemSuperheroBinding
import com.bumptech.glide.Glide

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)

    fun render(superHeroModel: SuperHero, onClickListener:(SuperHero) -> Unit) {
        binding.tvSuperHeroName.text = superHeroModel.superhero
        binding.tvRealName.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
        Glide.with(binding.ivSuperHero.context).load(superHeroModel.photo).into(binding.ivSuperHero)

        itemView.setOnClickListener { onClickListener(superHeroModel) }
    }
}
