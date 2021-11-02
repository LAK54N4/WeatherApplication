package com.laksana.weatherapplication.ui.today

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.laksana.weatherapplication.databinding.FragmentCurrentForecastBinding

class CurrentForecastFragment : Fragment() {

    private lateinit var currentForecastViewModel: CurrentForecastViewModel
    private var _binding: FragmentCurrentForecastBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        currentForecastViewModel =
            ViewModelProvider(this).get(CurrentForecastViewModel::class.java)

        _binding = FragmentCurrentForecastBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textToday
        currentForecastViewModel.text.observe(viewLifecycleOwner, {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}