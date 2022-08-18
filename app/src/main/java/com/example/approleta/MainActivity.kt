package com.example.approleta

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
        btnRodarNumero.setOnClickListener {
            val texto = findViewById<TextView>(R.id.txtSorteio)
            val numero = findViewById<EditText>(R.id.txtNumero)

            // se a string consegue ser convertida retorna o número se não null
            val valorNumero = numero.text.toString().toIntOrNull()

            if (valorNumero == null) {
                texto.text = "Digite um número"
            } else {
                // gera um número aleatório de 0 a 1
                val numeroSorteado = Random().nextInt(11)

                // compara se o número digitado é igual ao aleatório
                if(valorNumero == numeroSorteado) {
                    texto.text = "Parabéns! Você acertou o número"
                }else{
                    // define um novo texto para TextView
                    texto.text = "Errou ): o número sorteado foi $numeroSorteado"
                }

            }
        }
    }
}