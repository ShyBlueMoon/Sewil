package com.luanasilva.sewil

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.luanasilva.sewil.ui.controleestoque.ControleEstoqueFragment.Companion.TAG
class TesteActivity : AppCompatActivity() {

    lateinit var textExibirTexto: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_teste)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        receberDados()
    }
    private fun receberDados() {

        val puxarTexto = intent.getStringExtra(TAG)
        textExibirTexto = findViewById<TextView>(R.id.textTesteExibicao).apply {
            text = puxarTexto
        }

    }

}