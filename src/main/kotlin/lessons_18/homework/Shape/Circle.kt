package com.Nikita.lessons_18.homework.Shape

class Circle(val radius: Double) : Shape(){
    override fun area() : Double{
        return radius * radius * 3.14
    }
}