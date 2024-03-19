package com.luanasilva.sewil.ui.controleestoque

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.luanasilva.sewil.databinding.FragmentControleEstoqueBinding

class ControleEstoqueFragment : Fragment() {

    private lateinit var binding: FragmentControleEstoqueBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentControleEstoqueBinding.inflate(inflater, container, false)
        return binding.root
    }

}