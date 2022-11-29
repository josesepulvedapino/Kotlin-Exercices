package com.example.kotlinretos

import java.util.*

fun main(args: Array<String>) {
    println("Hello, world!")
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is it today?")
    val theDayNumber = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    var day = ""
    when (theDayNumber) {
        1 -> day = "Sunday"
        2 -> day = "Monday"
        3 -> day = "Tuesday"
        4 -> day = "Wednesday"
        5 -> day = "Thursday"
        6 -> day = "Friday"
        7 -> day = "Saturday"
    }
    println("Today is $day")
}