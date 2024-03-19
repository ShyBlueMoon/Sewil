package com.luanasilva.sewil.ui.quartoslimpezamanutencao

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.luanasilva.sewil.databinding.FragmentQuartosLimpezaManutencaoBinding


class QuartosLimpezaManutencaoFragment : Fragment() {

    private lateinit var binding:FragmentQuartosLimpezaManutencaoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuartosLimpezaManutencaoBinding.inflate(inflater, container, false)
        return binding.root
    }
}
