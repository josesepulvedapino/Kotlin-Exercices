package com.example.kotlinretos

import java.util.*
import kotlin.math.pow

/*
Create a main() function.
From the main() function, call a function, getFortuneCookie(), that returns a String.
Create a getFortuneCookie() function that takes no arguments and returns a String.
In the body of getFortuneCookie(), create a list of fortunes. Here are some ideas:

"You will have a great day!"
"Things will go well for you today."
"Enjoy a wonderful day of success."
"Be humble and all will turn out well."
"Today is a good day for exercising restraint."
"Take it easy and enjoy life!"
"Treasure your friends because they are your greatest fortune."
 */

fun main() {
    val fish: Int = 2 + 71 + 233 - 13
    val aquarium = fish/30
    println("We have $fish fishes and $aquarium aquarium")
    var rainbowColor: String? = "blue"
    rainbowColor = "Red"
    val blackColor = "black"
    //blackColor = "White"
    rainbowColor = null
    var greenColor: String? = "Green"
    var blueColor: String? = "Blue"
    blueColor = null

    var nullTest: Int? = null
    if (nullTest != null) {
        nullTest = 1
    } else {
        nullTest = 0
    }
    println(nullTest)

    println("La suma entre 5 y 10 es ${5+10}")


    val fishRange = 50
    if (fishRange in 1..100) println(fishRange)


    val peces = 8
    when (peces) {
        0 -> println("tanque vacio")
        10 -> println("tanque lleno")
        else -> println("perfecto")
    }

    var string1: String = "trout"
    var string2: String = "haddock"
    var string3: String = "snapper"
    println("I like to eat $string1")

    var fishlenght = "jose"
    when (fishlenght.length) {
        0 -> println("Error")
        in 3..12 -> println("Good fish name")
        else -> println("Ok fish name")
    }

    val myList = mutableListOf("Hola","Como","Estay")
    //myList = mutableListOf("wena")
    myList.remove("Hola")
    myList.add("Hola2")
    println(myList)

    val school = arrayOf("hola","como","estai")

    println(Arrays.toString(intArrayOf(2)))

    val mix = arrayOf("fish",3)
    val mix2 = listOf("hola",3)

    val array = Array(7) {1000.0.pow(10)}
    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
        "terabyte", "petabyte", "exabyte")
    for ((i, value) in array.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }

    val numbers= intArrayOf(11,12,13,14,15)
    var mutablelist = mutableListOf<String>()

    for (element in numbers) {
        mutablelist = mutableListOf(element.toString())
        println(mutablelist)
    }

    /*
    How can you use a for loop to create (a list of) the numbers between 0 and 100 that are divisible by 7?..

     */
    var myDiv7List = mutableListOf<Int>()
    for (number in 1..100) {
        if (number % 7 == 0 ) myDiv7List.add(number)
    }
    println(myDiv7List)
}

