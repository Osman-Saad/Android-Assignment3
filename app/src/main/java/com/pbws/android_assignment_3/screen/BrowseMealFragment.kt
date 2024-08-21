package com.pbws.android_assignment_3.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pbws.android_assignment_3.adapter.MealAdapter
import com.pbws.android_assignment_3.databinding.FragmentBrowseMealBinding
import com.pbws.android_assignment_3.model.Meal

class BrowseMealFragment : Fragment() {
    private var _binding: FragmentBrowseMealBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBrowseMealBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.mealsRecycleview.adapter = MealAdapter(Meal.mealList){id->
            val action = BrowseMealFragmentDirections.actionBrowseToMealDetailsFragment(id)
            findNavController().navigate(action)
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}