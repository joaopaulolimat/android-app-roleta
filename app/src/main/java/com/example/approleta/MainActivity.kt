package com.example.approleta

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // identifica o componente pelo seu id
        val btnRodarNumero = findViewById<Button>(R.id.button)

        // adiciona o listener de click
        btnRodarNumero.setOnClickListener{
            val texto = findViewById<TextView>(R.id.txtSorteio)

            // gera um número aleatório de 0 a 1
            val numeroSorteado = Random().nextInt(2)

            // define um novo texto para TextView
            texto.text = "Número sorteado é: $numeroSorteado"
        }
    }
}