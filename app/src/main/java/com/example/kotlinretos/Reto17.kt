package com.example.kotlinretos

fun main() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val filtroLenght = spices.sortedBy { it.length }.filter { it.contains("curry")}
    val filtroStartEnd = spices.filter { it.startsWith('c') and it.endsWith('e')}
    val filtroStartEnd2 = spices.filter { it.first() == 'c' && it.last() == 'e'}
    val firstThreeElements = spices.take(3).filter { it.startsWith('c') }
    println(filtroLenght)
    println(filtroStartEnd)
    println(filtroStartEnd2)
    println(firstThreeElements)

}