package com.example.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//Declarando botão de calcular e associando ao id botaocalcular
        val btCalc = botaocalcular
//declarando campo de texto de nota final a associando ao id notafinal
        val resultado = notafinal

//Evento de clic no botão associado a variável do botão btCalc e declaração de variáveis associadas ao evento
        btCalc.setOnClickListener {
//Declarando notas 1 e 2 e transformando o string recebido em inteiro
            val nota1:Int = Integer.parseInt(nota1.text.toString())
            val nota2:Int = Integer.parseInt(nota2.text.toString())
//calculo da média das notas 1 e 2
            val medianotas:Int = (nota1 + nota2)/2
//Declaração de numero de faltas e transformando em inteiro o valor recebido em string
            val numerofaltas:Int = Integer.parseInt(numerofaltas.text.toString())
//condicional para mostrar resultado e mensagem de acordo com valor da média de notas
            if(medianotas >=6){
                    if(numerofaltas <= 10) {
                        resultado.setText("Aluno Aprovado!!!" + "\n" + "Nota Final: " + medianotas + "\n" + "Faltas: " + numerofaltas)
                        resultado.setTextColor(Color.GREEN)
                    }
                    else{
                        resultado.setText("Aluno Reprovado por Faltas: " + "\n" + "Media:" + medianotas + "\n" + "Faltas: " + numerofaltas)
                        resultado.setTextColor(Color.RED)
                    }
            }
            else{
                resultado.setText("Aluno Reprovado por Nota" + "\n" + "Nota Final: " + medianotas + "\n" + "Faltas: " + numerofaltas)
                resultado.setTextColor(Color.RED)
            }
        }
    }
}