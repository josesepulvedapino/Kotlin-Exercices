package com.example.kotlinretos
/*
* Enunciado: Crea una función que reciba días, horas, minutos y segundos (como enteros) y retorne su resultado en milisegundos.
 */

fun main() {
    print(toMil(1,0,34,0))
    print(" Milisegundos")
}

fun toMil(dias: Int, horas: Int, minutos: Int, segundos: Int) : Int {
    val diasMil = dias * 86400000
    val horasMil = horas * 3600000
    val minutosMil= minutos * 60000
    val segundosMil= segundos * 1000
    val totalMil = diasMil + horasMil + minutosMil + segundosMil
    return totalMil

}


