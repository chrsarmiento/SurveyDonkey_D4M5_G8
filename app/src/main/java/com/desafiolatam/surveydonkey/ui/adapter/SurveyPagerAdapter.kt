package com.desafiolatam.surveydonkey.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.desafiolatam.surveydonkey.ui.fragment.EndFragment
import com.desafiolatam.surveydonkey.ui.fragment.FirstQuestionFragment
import com.desafiolatam.surveydonkey.ui.fragment.FourthQuestionFragment
import com.desafiolatam.surveydonkey.ui.fragment.SecondQuestionFragment
import com.desafiolatam.surveydonkey.ui.fragment.StartFragment
import com.desafiolatam.surveydonkey.ui.fragment.ThirdQuestionFragment

class SurveyPagerAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {

    // Cantidad de vistas en el ViewPager
    override fun getItemCount(): Int = 6

    // Cada posicion del ViewPager retorna un fragment distinto
    override fun createFragment(position: Int): Fragment =
        when (position) {
            0 -> StartFragment()
            1 -> FirstQuestionFragment()
            2 -> SecondQuestionFragment()
            3 -> ThirdQuestionFragment()
            4 -> FourthQuestionFragment()
            5 -> EndFragment()
            else -> StartFragment()
        }
}