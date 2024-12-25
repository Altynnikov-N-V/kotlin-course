package com.Nikita.lessons_18.homework.Shape

class Square(val height: Double, val weight: Double) : Shape(){
    override fun area() : Double{
        return height * weight
    }
}