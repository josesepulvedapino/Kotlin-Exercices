package com.example.kotlinretos

/*
 * Enunciado: Crea un función que reciba un texto y retorne la vocal que más veces se repita.
 * Si no hay vocales podrá devolver vacío.
 */

fun main() {
    vocal("Zapato")
}

fun vocal(text: String) {
    val vocA = text.lowercase().count { it == 'a' }
    val vocE = text.lowercase().count { it == 'e' }
    val vocI = text.lowercase().count { it == 'i' }
    val vocO = text.lowercase().count { it == 'o' }
    val vocU = text.lowercase().count { it == 'u' }

    when {
        vocA > vocE && vocA > vocI && vocA > vocO && vocA > vocU -> println("a")
        vocE > vocA && vocE > vocI && vocE > vocO && vocE > vocU -> println("e")
        vocI > vocE && vocI > vocA && vocI > vocO && vocI > vocU -> println("i")
        vocO > vocA && vocO > vocE && vocO > vocI && vocO > vocU -> println("o")
        vocU > vocA && vocU > vocE && vocU > vocI && vocU > vocO -> println("u")
        else -> ""
    }
}