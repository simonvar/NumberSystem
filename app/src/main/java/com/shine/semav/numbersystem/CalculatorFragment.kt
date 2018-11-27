package com.shine.semav.numbersystem

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class CalculatorFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_calculator, container, false)
        setHasOptionsMenu(true)

        return view
    }

    companion object {
        fun newInstance(): CalculatorFragment {
            return CalculatorFragment()
        }
    }

}