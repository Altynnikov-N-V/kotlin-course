package com.Nikita.lessons_18.homework.Shape

class Triangle(val side1: Double, val side2: Double, val side3: Double): Shape(){
    override fun area(): Double {
        return side1* side2* Math.sin(side3)
    }
}
