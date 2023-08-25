package com.desafiolatam.surveydonkey.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.desafiolatam.surveydonkey.databinding.FragmentEndBinding
import com.desafiolatam.surveydonkey.viewmodel.MainViewModel

class EndFragment : Fragment() {

    private var _binding: FragmentEndBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEndBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cargarDatos()
    }

    override fun onResume() {
        super.onResume()
        cargarDatos()
    }

    override fun onPause() {
        super.onPause()
        cargarDatos()
    }

    private fun cargarDatos(){
        binding.tvFirstAnswer.text = viewModel.getFirstResult()
        binding.tvSecondAnswer.text = viewModel.getSecondResult()
        binding.tvThirdQuestion.text = viewModel.getThirdResult()
        binding.tvUserEmail.text = viewModel.getUserEmail()
        binding.tvUserSuggest.text = viewModel.getUserSuggest()
    }
}