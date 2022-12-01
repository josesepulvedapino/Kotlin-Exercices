package com.example.kotlinretos

import com.example.kotlinretos.Classes.Aquarium
import com.example.kotlinretos.Classes.SimpleSpice

fun main() {
    buildAquarium()
}

private fun buildAquarium() {
    val myAquarium = Aquarium()
    println("My aquarium is ${myAquarium.width} width, ${myAquarium.height} height and ${myAquarium.length} length")
    myAquarium.width = 80.0
    println(myAquarium.width)
    println("Volume: ${myAquarium.volume} liters.")

    val simpleSpice = SimpleSpice()
    println("The name of spice is ${simpleSpice.name} and their heat is ${simpleSpice.heat}")
}