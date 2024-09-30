package com.Nikita.lessons_5

//    Задание выполняется в текстовом файле. Вычисли результат выражений
//
//    Простой уровень
//    (12 / 3 > 3) && (5 * 2 == 10) пример решения: true && true = true
    //true
//    (14 - 4 <= 10) || (6 / 2 != 3)
    //true
//    (9 + 1 == 10) && (8 % 2 == 0)
    //true
//    (7 - 2 < 5) || (4 * 3 != 12)
    //false
//    (18 / 6 >= 3) && (5 + 5 == 10)
    //true
//    (11 % 3 != 2) || (9 - 3 == 6)
    //true
//    (5 * 2 < 11) && (14 / 2 == 7)
    //true
//    (8 + 2 <= 10) || (7 % 2 != 1)
    //true
//    (16 / 4 > 3) && (3 + 4 == 7)
    //true
//    (10 % 2 == 0) || (5 - 3 != 1)
    //true
//
//    Сложный уровень
//    ((4 * 3) < 13) && !(8 / 4 == 2) || (10 % 3 != 1)
    //false
//    ((14 - 5) > 8) || (9 / 3 == 3) && !(7 + 0 != 7)
    //true
//    ((2 + 3) <= 5) && (16 / 4 == 4) || !(6 % 2 == 0)
    //true
//    ((5 * 3) != 15) && !(10 / 2 > 4) || (4 + 4 == 8)
    //true
//    ((12 / 4) >= 3) || (7 % 2 != 1) && !(3 + 3 == 6)
    //true
//
//    Продвинутый уровень
//    (var f = 6; --f >= 5) || ((3 * 2 == 6) && (9 - 4 != 5))
    //true
//    ((var g = 0; g++ != 0) && (4 + 2 == 6)) || (5 / 1 == 5)
    //true
//    (var h = 7; h-- > 6) || (8 + 1 == 9) && (3 % 2 != 1)
    //true
//    ((var i = 5; i++ == 5) || (2 * 2 != 4)) && (10 / 2 == 5)
    //true
//    (var j = 4; j-- < 4) && ((6 + 0 == 6) || (5 % 2 != 1))
    //false
//
//    Оператор элвиса
//
//    Задание выполняется в виде функций, принимающих один или более аргументов. Все функции должны быть вызваны из
//    функции main() в вариантах с null и с вещественным значением.
//
//    ======
//
//    Контекст: Вы изучаете физическое явление затухания звука в помещении. У вас есть измеренное значение начальной
//    интенсивности звука, но из-за ограничений оборудования данные о коэффициенте затухания иногда могут быть
//    неизвестны.
//    Задача: Рассчитать предполагаемую интенсивность звука после затухания. Интенсивность звука после затухания
//    пропорциональна начальной интенсивности, умноженной на коэффициент затухания. Если коэффициент затухания
//    неизвестен, использовать стандартное значение 0.5.
fun intensitySound(intensity: Double, defaultCoef: Double?): Double{
    val effect = defaultCoef ?: 0.5
    return intensity * effect
}
//    ======
//    Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз, которая составляет
//    0,5% от его стоимости. В случае, если стоимость не указана, то берётся стандартная стоимость в $50
//    Задача: Рассчитать полную стоимость доставки.
fun fullCost(deliveryCost: Double, cargoCost: Double?) :Double {
    val standartCargoCost = cargoCost ?: 50.0
    val insurance = standartCargoCost * 0.005
    return deliveryCost + insurance
}

fun main() {
    val intensity = 30.0
    val knowCoef: Double? = 0.7
    val intensityWithKnowCoef = intensitySound(intensity, knowCoef)
    println(intensityWithKnowCoef)

    val unKnowCoef: Double? = null
    val intensityUnKnowCoef = intensitySound(intensity, unKnowCoef)
    println(intensityUnKnowCoef)

    val deliveryCost = 500.0
    val cargoCost1: Double? = 1000.0
    val totalCostWithKnow = fullCost(deliveryCost, cargoCost1)
    println(totalCostWithKnow)

    val cargoCost2: Double? = null
    val totalCostWithUnKnow = fullCost(deliveryCost, cargoCost2)
    println(totalCostWithUnKnow)
}