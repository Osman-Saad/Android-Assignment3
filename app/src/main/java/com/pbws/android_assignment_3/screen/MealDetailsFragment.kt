package com.pbws.android_assignment_3.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.pbws.android_assignment_3.databinding.FragmentMealDetailsBinding
import com.pbws.android_assignment_3.model.Meal


class MealDetailsFragment : Fragment() {
    private var _binding: FragmentMealDetailsBinding? = null
    private val binding get() = _binding!!
    private val args:MealDetailsFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMealDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val meal = Meal.mealList[args.id]
        binding.mealDetailsImg.setImageResource(meal.image)
        binding.mealDetailsText.text = meal.name
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}