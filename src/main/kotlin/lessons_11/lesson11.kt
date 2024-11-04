package com.Nikita.lessons_10

fun main () {
    var pair: Pair<Int, String> = 1 to "a"   //Объект, который хранит 2 значения
    var pair2 = Pair(2, "a")

    println(pair.first)
    println(pair.second)

    val emptyMap: Map<String, String> = mapOf<String, String>()  //Словарь хранит данные в ввиде ключа и значения

    val a1 = "Россия" to "Москва"
    val a2 = "Франция" to "Париж"
    val capitals = mapOf(a1, a2)
    val map: Map<Int, String> = mapOf(1 to "a", 2 to "b", 3 to "c")

    //Доступно изменение значений по ключу
    val mutableCapitals = mutableMapOf("Россия" to "Москва", "Франия" to "Париж")
    val capitalsOfRussia = capitals["Россия"]
    println(capitalsOfRussia)

    //Добавление нового элемента
    mutableCapitals["Германия"] = "Берлин"
    mutableCapitals.remove("Франция")

    //Перебор значений
    for (entries in mutableCapitals) {
        println("${entries.key} : ${entries.value}")
    }
    //Перебор работает только со словарями
    for ((country, capital) in capitals) {
        println("$country: $capital")
    }
    //Ключи могут быть null
    val mapWithNullableKey = mutableMapOf<String?, Int>(null to 1)

    //Практическая работа
    //Создание пустого неизменяемого словаря где ключи строки, значения целые числа
    val myMap = mapOf<Int, String>()
    //Неизменяемый словарь ключи целые числа значения строки - проинициализировать
    val myLovingMap = mapOf(1 to "a", 2 to "b")
    //Изменяемый словарь + переменная
    val myFavoriteMap = mutableMapOf(1 to "a")
    //Добавление значения
    myFavoriteMap[34] = "asf"
    //Получение значения из словаря по ключу
    println(myFavoriteMap[1])
    //Получение значения из словаря по ключу, которого заведомо в словаре нет, возвращается null
    println(myFavoriteMap[555])
    myFavoriteMap.remove(999)

    //Перебор словаря в цикле
    for (entries in myLovingMap) {
        println("${entries.key}:${entries.value}")
    }
    for ((key, value) in myLovingMap) {
        println("$key : $value")
    }
    //Словарь в котором ключи строки, а значения списки целых чисел
    val myOneMap: Map<String, List<Int>> = mapOf("St" to listOf(1, 2, 4))
    //График работы сотрудников
    val daysMap = mapOf<String, List<String>> ()
    val mapYear = mapOf<String, MutableMap<String, String>> ()
    val mutableMap0fGame = mapOf<String, MutableSet<String>> ()

}
//Поиск ключа по значению
fun searchKe(myMap: Map<String, String>, world: String): String {
    for ((key, value) in myMap) {
        if (value == world) return key
    }
    return "World"
}
//