package com.desafiolatam.surveydonkey.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.desafiolatam.surveydonkey.R
import com.desafiolatam.surveydonkey.databinding.FragmentThirdQuestionBinding
import com.desafiolatam.surveydonkey.viewmodel.MainViewModel


class ThirdQuestionFragment : Fragment() {

    private var binding: FragmentThirdQuestionBinding? = null

    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdQuestionBinding.inflate(inflater,container,false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.run {
            this!!.answer31.setOnCheckedChangeListener { _, checked ->
                if (checked) viewModel.addThirdAnswer(answer31.text.toString())
                else viewModel.removeThirdAnswer(answer31.text.toString())
            }
            this!!.answer32.setOnCheckedChangeListener { _, checked ->
                if (checked) viewModel.addThirdAnswer(answer32.text.toString())
                else viewModel.removeThirdAnswer(answer32.text.toString())
            }
            this!!.answer33.setOnCheckedChangeListener { _, checked ->
                if (checked) viewModel.addThirdAnswer(answer33.text.toString())
                else viewModel.removeThirdAnswer(answer33.text.toString())
            }
            this!!.answer34.setOnCheckedChangeListener { _, checked ->
                if (checked) viewModel.addThirdAnswer(answer34.text.toString())
                else viewModel.removeThirdAnswer(answer34.text.toString())
            }
        }
    }


}