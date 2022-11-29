package com.example.kotlinretos

fun main(args: Array<String>) {
    println("Your fortune is: ${getFortune(5)}")
}

fun getBirthday(): Int? {
    println("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return birthday
}

fun getFortune(birthday: Int) : String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.n",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    when (birthday) {
        in 2..5 -> return "You will have a great day!"
        in 6..12 -> return "Things will go well for you today."
        in 13..24 -> return "Enjoy a wonderful day of success."
        else -> return "Treasure your friends because they are your greatest fortune."
    }
}