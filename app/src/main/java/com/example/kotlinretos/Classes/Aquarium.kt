package com.example.kotlinretos.Classes

class Aquarium {
    var width: Double = 20.0
    var length: Double = 20.0
    var height: Double = 20.0

    var volume: Double
    get() = width * height* length / 1000
    set(value) { height = (value * 100 / (width * length))}


}