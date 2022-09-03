package com.example.primeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val palavras = arrayOf("Palavra1","Palavra2", "Palavra3","Palavra4")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun sortearPalavra(view: View){
        val texto = findViewById<TextView>(R.id.resultado1)
        val totalarray = palavras.size
        val sorteado = Random.nextInt(totalarray)

        texto.setText(palavras[sorteado])


    }

    fun sortearNumero10(view: View){
        var texto = findViewById<TextView>(R.id.resultado2)
        var numerosorteado = Random.nextInt(10)

        texto.setText("Número: $numerosorteado")


    }



}