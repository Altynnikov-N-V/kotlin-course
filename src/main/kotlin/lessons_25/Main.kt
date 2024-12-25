package com.Nikita.lessons_25

fun main() {
    //Анонимные функция
    val increment = fun(a: Int): Int {
        return a + 1
    }
    val increment1: (a: Int) -> Int = {
        it + 1
    }

    val increment2 = { a: Int ->
        a + 5
    }
    println(increment2(2))

    val findIndex = fun(text: String, word: String, ignoreCase: Boolean): Int {
        return text.indexOf(word, 0, ignoreCase)
    }

    val findIndex1: (String,String,Boolean) -> Int = {text,word,ignoreCase ->
        text.indexOf(word,0, ignoreCase)
    }

    val findIndex2 = { text: String, word: String, ignoreCase: Boolean ->
        text.indexOf(word, 0, ignoreCase)
    }
    println(findIndex2("I love Kotlin", "Love", false))

    val calculateDeliveryTime = fun OrderProcessor.(productId: Int): String {
        val deliveryTimeDays = when (productId) {
            in 1..100 -> 3
            else -> 5
        }
        return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
    }
    //Лямбда выражение
    val calculateDeliveryTime1: OrderProcessor.(Int) -> String = {
        val deliveryTimeDays = when (it) {
            in 1..100 -> 3
            else -> 5
        }
        "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
    }

    val op = OrderProcessor("my adress")
    op.calculateDeliveryTime(35)

}

//Обычное объявление функции
val increment = fun(a: Int): Int {
    return a + 1
}

fun findIndex(text: String, word: String, ignoreCase: Boolean = false): Int {
    return text.indexOf(word, 0, ignoreCase)
}
class OrderProcessor(val deliveryAddress: String) {

    fun calculateDeliveryTime(productId: Int): String {
        val deliveryTimeDays = when (productId) {
            in 1..100 -> 3
            else -> 5
        }
        return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
    }
}

fun OrderProcessor.calculateDeliveryTime(productId: Int): String {
    val deliveryTimeDays = when (productId) {
        in 1..100 -> 3
        else -> 5
    }
    return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
}