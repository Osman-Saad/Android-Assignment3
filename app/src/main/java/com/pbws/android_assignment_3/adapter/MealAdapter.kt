package com.pbws.android_assignment_3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pbws.android_assignment_3.databinding.MealItemBinding
import com.pbws.android_assignment_3.model.Meal

class MealAdapter(var meals:List<Meal>,var onItemClick:(Int)->Unit):RecyclerView.Adapter<MealAdapter.MealViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealViewHolder {
        val mealBinding = MealItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MealViewHolder(mealBinding)
    }

    override fun getItemCount() = meals.size

    override fun onBindViewHolder(holder: MealViewHolder, position: Int) {
        holder.bind(position)
    }




    inner class MealViewHolder(var binding:MealItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int){
            var meal = meals[position]
            binding.mealImage.setImageResource(meal.image)
            binding.mealTitle.text = meal.name
            binding.root.setOnClickListener {
                onItemClick(position)
            }
        }

    }


}