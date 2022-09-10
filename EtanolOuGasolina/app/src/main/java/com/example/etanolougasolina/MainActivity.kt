package com.example.etanolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun calcula(view: View){

        //val etanol = findViewById<EditText>(R.id.editetanol)
        //val gasolina = findViewById<EditText>(R.id.editgasolina)

        val precoEtanol = editetanol.text.toString()
        val precoGasolina = editgasolina.text.toString()



        val validacampos = validarCampos(precoEtanol,precoGasolina)

        if(validacampos == true){
            calculapreco(precoEtanol,precoGasolina)
        }else{
            valor.setText("Inválido")
        }

    }

    fun validarCampos(precoEtanol: String, precoGasolina: String) : Boolean{

        var camposvalidados: Boolean = true

        if(precoEtanol == null || precoEtanol.equals("")){

            camposvalidados = false
        }else{
            camposvalidados = true
        }

        return camposvalidados
    }

    fun calculapreco(precoEtanol:String, precoGasolina:String){

        val valorEtanol = precoEtanol.toDouble()
        val valorGasolina = precoGasolina.toDouble()

        val resultadoCombustivel = valorEtanol / valorGasolina

        val resultado = findViewById<TextView>(R.id.valor)

        if(resultadoCombustivel >= 0.7){
            resultado.setText("Melhor gasolina")

        }else{
            resultado.setText("Melhor etanol")

        }


    }



}