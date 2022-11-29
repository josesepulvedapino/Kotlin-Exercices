package com.example.kotlinretos


fun main() {
    println(whatShouldIDoTodayBetter(yourMood(), "sunny",17))
}

fun whatShouldIDoTodayBetter(mood: String = "normal", weather: String = "sunny", temperature: Int = 24) : String {
    when {
        goWalk(mood,weather,temperature) -> return "go for a walk."
        writeCode(mood,weather,temperature) -> return "write some code in your house."
        playMusic(mood, weather, temperature) -> return "play music."
        else -> return "Google it."
    }
}

fun goWalk(mood: String, weather: String, temperature: Int) = mood == "happy" && weather =="sunny" && temperature > 17

fun writeCode(mood: String, weather: String, temperature: Int) = mood == "normal" && weather =="rainy" && temperature < 17

fun playMusic(mood: String, weather: String, temperature: Int) = mood == "sad" && weather =="sunny" && temperature > 17

fun yourMood(): String {
    print("How do you feel today? normal, sad or happy?: ")
    val yourmood = readLine().toString()
    return yourmood
}