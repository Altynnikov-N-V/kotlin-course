package com.Nikita.lessons_17.homework

open class GeometricFigure(val name: String, val square: Double) {
}

open class Polygon(
    name: String,
    val sides: Int,
    square: Double,
    val perimetr: Int
) : GeometricFigure(name, square)

class Circle(
    name: String,
    val radius: Double,
    square: Double
) : GeometricFigure(name, square)

class Triangle(
    name: String,
    square: Double,
    perimetr: Int
)
