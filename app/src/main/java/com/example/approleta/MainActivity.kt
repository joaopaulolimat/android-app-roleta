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

        val btnRodarNumero = findViewById<Button>(R.id.button)

        btnRodarNumero.setOnClickListener{
            var texto = findViewById<TextView>(R.id.txtSorteio)
            var numeroSorteado = Random().nextInt(11)
            texto.text = "Número sorteado é: $numeroSorteado"
        }
    }
}