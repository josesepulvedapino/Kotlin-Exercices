package com.example.kotlinretos

/*
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 */

fun main() {
    var a :Long = 0 //Se definen como Long para que los ultimos numeros de la serie fibonacci no arrojen numeros erroneos
    var b :Long = 1 //Se definen como Long para que los ultimos numeros de la serie fibonacci no arrojen numeros erroneos
    var x = 1
    while (x<50) {
        val c = a + b
        println(c)
        a = b
        b = c
        x++

    }
}

