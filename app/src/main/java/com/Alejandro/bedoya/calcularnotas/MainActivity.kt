package com.Alejandro.bedoya.calcularnotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //aqui declaramos todos kas cosas que colocamos el la vista
    private lateinit var nombre: EditText
    private lateinit var notas: EditText
    private lateinit var porsentajes: EditText
    private lateinit var Retornar: Button
    private lateinit var Finalizar: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.entrada)

// aqui llamamos las cosas de claradas
        nombre = findViewById(R.id.nombre)
        notas = findViewById(R.id.notas)
        porsentajes = findViewById(R.id.porcentajes)
        Retornar = findViewById(R.id.Retornar)
        Finalizar = findViewById(.id.FiRnalizar)


        var porcentajeAcomulado = 0

        val listaDePorcentaje: MutableList<Int> = mutableListOf()

        val listaDeNotas: MutableList<Double> = mutableListOf()


        fun validarPorcentaje(porcentaje: Int) {

            val porcentajeAdquirido = porcentaje + porcentajeAcomulado

            if (porcentajeAdquirido <= 100) {

            } else {
                /*TODO mostrar un toast que informe al usuario, que el procentaje ingresado
                   no es valido.*/

            }
        }


        fun validarNotas(notas: Double) {


            if (notas >= 0.0 && notas <= 5.0) {

                /*TODO mostrar un toast que informe al usuario, que la nota ingresada
                         no es valida.*/


                listaDeNotas.add(notas)

            } else {
                //TODO
            }
        }

        class Estudiante(
            val nombre: String,
            val notas: Array<Double>,
            val porcentaje: Array<Int>
        ) {

            val p1 = 20 //Parcial 1
            val p2 = 20
            val ef = 30
            val pn = 5
            val ta = 15
            val qz = 10


            fun calcularNotaFinal(): Double {

                var indice = 1

                var notafinal = 0.0


                for (n in notas) {

                    when (indice) {
                        1 -> {
                            notafinal += n * p1
                        }

                        2 -> {
                            notafinal += n * p2
                        }

                        3 -> {
                            notafinal += n * ef
                        }

                        4 -> {
                            notafinal += n * pn
                        }

                        5 -> {
                            notafinal += n * ta
                        }

                        6 -> {
                            notafinal += n * qz

                        }

                    }

                    indice++

                }
                return notafinal / 100


                fun notaFinal(notas: Double) {

                    if (notas >= 3.0) {
                        /*TODO mostrar un toast que informe al usuario que gano */
                    } else {
                        /*TODO mostrar un toast que informe al usuario que peridó.*/
                    }


                }


            }


        }
    }
}



