package com.luanasilva.sewil.ui.controleestoque

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.luanasilva.sewil.R
import com.luanasilva.sewil.TesteActivity
import com.luanasilva.sewil.databinding.FragmentControleEstoqueBinding

class ControleEstoqueFragment : Fragment() {
    companion object {
        const val TAG:String = "Esse é um tag para o puExtra"
    }

    private lateinit var binding: FragmentControleEstoqueBinding
    private lateinit var btnEnviar: Button
    private lateinit var editNome: EditText


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentControleEstoqueBinding.inflate(inflater, container, false)
        val view = binding.root

        btnEnviar = view.findViewById(R.id.btnEnviar)
        editNome = view.findViewById(R.id.editNome)

        btnEnviar.setOnClickListener {
            val intent = Intent(activity, TesteActivity ::class.java)
            val nome = editNome.text.toString()

            if(nome.isNotEmpty()) {
                intent.putExtra(TAG,nome)
                startActivity(intent)
            }
        }
        return view
    }
 }