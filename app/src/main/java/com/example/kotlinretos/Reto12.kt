package com.example.kotlinretos

/*
Use the code you created in the last practice, or copy the starter code from below.

The getFortune() function should really only be getting the fortune, and not be in the business of getting the birthday.

Change your Fortune Cookie program as follows:

Create a function called getBirthday() that gets the birthday from the user.
Pass the result of getBirthday() to getFortune() using an Integer argument, and use it to return the correct fortune.
Remove getting the birthday from getFortune()
Instead of calculating the fortune based on the birthday, use a when statement to assign some fortunes as follows (or use your own conditions):
If the birthday is 28 or 31...
If the birthday is in the first week…
else … return the calculated fortune as before.
 */

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