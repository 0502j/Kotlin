package com.example.sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val palavras = arrayOf("Mantenha uma atitude vitoriosa! Quando você olha para uma pessoa curvada e triste, perde a confiança, porque verifica que está abatida e preparada para uma derrota. Não deixe que ninguém pense isso a seu respeito! Mantenha-se de cabeça erguida, confiante e risonho, e todos confiarão em você. Irradie força e entusiasmo até por meio da atitude de seu corpo.",
        "Não pare jamais de trabalhar para o bem! Cada vez que paramos, nossa alma começa a ficar na rigidez cadavérica. A alma inativa morre de tédio e cansaço. Não deixe que seu espírito se enfraqueça na inação. Viva alegre e entusiasta e empregue todas as suas forças na plantação do bem, do amor, do carinho no coração daqueles que o cercam na vida.",
        " Não perca sua serenidade. A raiva faz mal à saúde, o rancor estraga o fígado, a mágoa envenena o coração. Domine suas reações emotivas. Seja dono de si mesmo. Não jogue lenha no fogo de seu aborrecimento. Esqueça e passe adiante, para não perder sua serenidade. Não perca sua calma. Pense, antes de falar, e não ceda à sua impulsividade.",
        "Não se aborreça com seu amigo, só porque ele está mal humorado. Saiba desculpar. Quantas vezes também você está irritado, e responde mal a seus amigos... e no entanto gosta que eles o desculpem. Você não sabe o que lhe aconteceu, desconhece seus problemas íntimos... desculpe, então! Não leve a mal, releve, e continue a querer-lhe bem. É a melhor maneira de mostrar sua amizade e compreensão.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun sortearPalavra(view: View){
        val texto = findViewById<TextView>(R.id.resultado)
        val nova = findViewById<Button>(R.id.nova)
        val carta1 = findViewById<ImageView>(R.id.carta1)
        val carta2 = findViewById<ImageView>(R.id.carta2)
        val titulo = findViewById<TextView>(R.id.titulo)
        val decor = findViewById<ImageView>(R.id.imgdecor)

        val totalarray = palavras.size
        val sorteado = Random.nextInt(totalarray)
        texto.setText(palavras[sorteado])
        titulo.setText("O conselho para hoje é...")

        texto.visibility = View.VISIBLE
        carta1.visibility = View.GONE
        carta2.visibility = View.GONE
        nova.visibility = View.VISIBLE
        decor.visibility = View.VISIBLE

        nova.setOnClickListener(){
            texto.visibility = View.GONE
            carta1.visibility = View.VISIBLE
            carta2.visibility = View.VISIBLE
            nova.visibility = View.GONE
            decor.visibility = View.GONE
            titulo.setText("Escolha sua carta")
        }
    }


}