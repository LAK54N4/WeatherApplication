package com.laksana.weatherapplication.ui.weekly

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.laksana.weatherapplication.databinding.FragmentWeeklyForecastBinding

class WeeklyForecastFragment : Fragment() {

    private lateinit var weeklyForecastViewModel: WeeklyForecastViewModel
    private var _binding: FragmentWeeklyForecastBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        weeklyForecastViewModel =
            ViewModelProvider(this).get(WeeklyForecastViewModel::class.java)

        _binding = FragmentWeeklyForecastBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textWeek
        weeklyForecastViewModel.text.observe(viewLifecycleOwner, {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}