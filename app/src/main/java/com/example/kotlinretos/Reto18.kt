package com.example.kotlinretos

import java.util.*

fun main() {
    val lambda = { println("hola mundo")}()

    val lambdaDiv = { num: Int -> num/2}
    println(lambdaDiv(100)) //Numero que se dividira por 2

    val rollDice = {slides: Int -> if (slides == 0) 0 else println((Random().nextInt(slides) + 1) )}
    val rollDice2: (Int) -> Unit = {slides -> if (slides == 0) 0 else println((Random().nextInt(slides) + 1) )}
    rollDice(5) //Numero de lados
    rollDice2(5) //Numero de lados

    fun gamePlay(num: Int) {
        rollDice2(num)
    }
    gamePlay(100)
}

