package com.example.kotlinretos

/*
Change your fortune cookie program to use repeat() instead of a for loop. What happens to the break instruction? Using the error message from the compiler, with what you've learned so far, can you think of why?
Change your fortune cookie program to use a while loop, which is the better choice when you are looping until a condition is met.
 */


fun main() {
    var fortune: String
    for (x in 1..10) {
        fortune = getFortuneCookieRepeat()
        println("Your fortuine: is $fortune")
        if (fortune.contains("Take it easy and enjoy life!")) break }
}

fun getFortuneCookieRepeat() :String {
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
