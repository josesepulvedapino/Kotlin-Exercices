package com.example.kotlinretos
/*
* Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
* Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
* NO hace falta comprobar que ambas palabras existan.
* Dos palabras exactamente iguales no son anagrama.
*/

fun main() {
    println(anagrama("soo","oso"))

}

fun anagrama(palabra1: String, palabra2: String): Boolean {
    if (palabra1 == palabra2) {
        return false
    } else {
        return palabra1.toCharArray().sortedArray().contentEquals(palabra2.toCharArray().sortedArray())
        //Funcion toCharArray Convierte una cadena String en un array de caracteres.
        //Funcion sortedArray Ordena un array alfabeticamente
        //Funcion contentEquals Devuelve true si ambas arrays contienen los mismos elementos en el mismo orden, si no, false


    }
}

