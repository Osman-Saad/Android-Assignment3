package com.pbws.android_assignment_3.model

import com.pbws.android_assignment_3.R

data class Meal(
    var id:Int,
    var name:String,
    var image:Int
){
    companion object{
        val mealList = listOf(
            Meal(1,"Burger", R.drawable.burger),
            Meal(2,"Pancakes", R.drawable.pancakes),
            Meal(3,"Filletsteak", R.drawable.filletsteak),
            Meal(4,"Pizza", R.drawable.pizza),
            Meal(5,"Shawerma", R.drawable.shawerma),
            Meal(6,"Waffles", R.drawable.waffles),
            Meal(7,"Burger", R.drawable.burger),
            Meal(8,"Pancakes", R.drawable.pancakes),
            Meal(9,"Filletsteak", R.drawable.filletsteak),
            Meal(10,"Pizza", R.drawable.pizza),
            Meal(11,"Shawerma", R.drawable.shawerma),
            Meal(12,"Waffles", R.drawable.waffles),
            Meal(13,"Burger", R.drawable.burger),
            Meal(14,"Pancakes", R.drawable.pancakes),
            Meal(15,"Filletsteak", R.drawable.filletsteak),
            Meal(16,"Pizza", R.drawable.pizza),
            Meal(17,"Shawerma", R.drawable.shawerma),
            Meal(18,"Waffles", R.drawable.waffles)
        )
    }
}
