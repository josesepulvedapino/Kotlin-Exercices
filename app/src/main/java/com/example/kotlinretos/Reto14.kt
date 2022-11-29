package com.example.kotlinretos

/*
Create a program that suggests an activity based on various parameters.

Start in a new file with a main function.
From main(), create a function, whatShouldIDoToday().
Let the function have three parameters.
mood: a required string parameter
weather: a string parameter that defaults to "sunny"
temperature: an Integer parameter that defaults to 24 (Celsius).
 */

fun main() {
    println(whatShouldIDoToday("sad","sunny",15))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperatue: Int = 24) : String {
    when {
        mood == "happy" && weather == "sunny" && temperatue > 17 -> return "go for a walk."
        mood == "happy" && weather == "rainy" && temperatue < 17 -> return "write some code in your house."
        mood == "sad" && weather == "sunny" && temperatue > 17 -> return "play music."
        mood == "sad" && weather == "rainy" && temperatue < 17 -> return "cry."
        else -> return "Google it."
    }
}

