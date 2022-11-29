package com.example.kotlinretos

import kotlin.random.Random

fun main() {
    var fortune: String
    for (x in 1..10) {
        fortune = getFortuneCookie()
        println("Your fortuine: is $fortune")
        if (fortune.contains("Take it easy and enjoy life!")) break }
}

fun getFortuneCookie() :String {
    val fortunes = listOf(
        "You will have a great day!n",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.n",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return fortunes[birthday.rem(fortunes.size)]

}






