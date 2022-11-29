package com.example.kotlinretos

import java.util.Calendar

fun main(args: Array<String>) {
    println("Hello, world!")
    dayOfWeek()

}

fun dayOfWeek() {
    println("What day is it today?")
    val num = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    var dia: String = ""
    when (num) {
        0 -> dia = "Sunday"
        1 -> dia = "Monday"
        2 -> dia = "Tuesday"
        3 -> dia = "Wednesday"
        4 -> dia = "Thursday"
        5 -> dia = "Friday"
        6 -> dia = "Saturday"
        else -> {}
    }
    println("Today is $dia")
}
