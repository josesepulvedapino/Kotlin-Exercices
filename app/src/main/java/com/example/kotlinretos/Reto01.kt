package com.example.kotlinretos

/*
 * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión)
 *  sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
*/

fun main() {
    rangoNumeros()
}

fun rangoNumeros() {
    for (x in 1..100) {
        val Multx3 = x % 3 == 0
        val Multx5 = x % 5 == 0
        if (Multx5 && Multx3) {
            println("fizzbuzz")
        } else if (Multx5) {
            println("buzz")
        } else if (Multx3) {
            println("fizz")
        } else {
            println(x)
        }
    }
}


