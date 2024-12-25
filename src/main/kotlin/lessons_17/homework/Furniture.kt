package com.Nikita.lessons_17.homework

open class Furniture(
    val type: String,
    val height: Int,
    val weight: Int,
    val deep: Int
)

class OfficeFurniture(
    type: String,
    height: Int,
    weight: Int,
    deep: Int,
    val price: Double
) : Furniture(type, height, weight, deep)

class KitchenFurniture(
    type: String,
    height: Int,
    weight: Int,
    deep: Int,
    val moistureResistance: Boolean
) : Furniture(type, height, weight, deep)