package com.example.kotlinretos

fun main() {
    println("Your fortune is: ${getFortune(getBirthday())}")
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return birthday
}

fun getFortune(birthday: Int) : String {
    when (birthday) {
        in 2..5 -> return "You will have a great day!"
        in 6..12 -> return "Things will go well for you today."
        in 13..24 -> return "Enjoy a wonderful day of success."
        else -> return "Treasure your friends because they are your greatest fortune."
    }
}