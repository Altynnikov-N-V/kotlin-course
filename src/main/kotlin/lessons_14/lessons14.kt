package com.Nikita.lessons_14

fun main() {

    val fruitsPrices = mapOf("apple" to 2.99, "banana" to 1.99, "cherry" to 3.99)

    //Перебор словаря через entries
    for (entry in fruitsPrices.entries) {
        println("Key: ${entry.key}, Value: ${entry.value}")
    }

    //Деструктуризация - перебор словаря
    for ((fruit, price) in fruitsPrices) {
        println("Key: $fruit, Value: $price")
    }

    //Перебор данных из словаря
    val entries = fruitsPrices.entries
    val keys = fruitsPrices.keys
    val values = fruitsPrices.values

    //Методы получения элементов
    val priceOfPearOrElse = fruitsPrices.getOrElse("pear") { 0.0 }
    val priceOfApple = fruitsPrices.getValue("apple")
    //Верни значению по ключу или дефолтное значение
    val priceOfPearOrDefault = fruitsPrices.getOrDefault("pear", 0.0)

    //Изменение состава
    val fruitsWithoutBanana = fruitsPrices - "banana" //Вычитаем строку, новый словарь без этого значения
    val fruitsWithPineapple = fruitsPrices + ("pineapple" to 3.5) //Новый словарь с добавлением новой пары значений
    val mutableFruits = fruitsPrices.toMutableMap() //Создает новый словарь который будет изменяемый

    //
    mutableFruits["kiwi"] = 2.75 // Добавление элемента
    mutableFruits.putAll(mapOf("lime" to 1.1, "avocado" to 1.9)) //Взять другой словарь и объединить значения
    mutableFruits.remove("apple") // Удаление элемента
    mutableFruits.clear() // Очистить словарь

    //Проверки
    val containsApple = fruitsPrices.containsKey("apple") //Проверка наличия ключа
    val containsValue1_5 = fruitsPrices.containsValue(1.5) //Проверка наличия значения
    val isEmpty = fruitsPrices.isEmpty() //Проверка, что словарь является пустым
    val isNotEmpty = fruitsPrices.isNotEmpty() //Проверка, что словарь является не пустым
    val areAllFruitsExpensive =
        fruitsPrices.all { it.value > 1.0 } // && Проверяют элементы словаря на условия, все должны
    // соответствовать
    val isAnyFruitCheap =
        fruitsPrices.any { it.value < 1.0 } // || Если любой элемент будет соответствовать, то будет true

    val filteredByPrice = fruitsPrices.filter { it.value > 1.0 } //Фильтрация
    val filteredByKeys = fruitsPrices.filterKeys { it.startsWith("a") } //Фильтрация по ключам
    val filteredByValues = fruitsPrices.filterValues { it < 2.0 } //Фильтрация по значениям
    val filteredNotApple = fruitsPrices.filterNot { it.key == "apple" } //Отфильтрует значения, которые не удовлетворяют
    val countExpensiveFruits = fruitsPrices.count { it.value > 1.5 } // Количество элементов

    val increasedPrices = fruitsPrices.mapValues { it.value * 1.1 } //Преобразование значений
    val fruitNamesUppercase = fruitsPrices.mapKeys { it.key.uppercase() } //Преобразование ключей
    val fruitsList = fruitsPrices.map { "${it.key} costs ${it.value}" } //Преобразует словарь в список

    val toMap = mutableFruits.toMap() //Трансформация в неизменяемый словарь
    val toMutableMap = fruitsPrices.toMutableMap() //Трансформация в изменяемый словарь

    fruitsPrices.forEach { (fruit, price) -> //Деструктуризация
        println("$fruit costs $price")
    }
    fruitsPrices.forEach {
        println("${it.key} costs ${it.value}")
    }

    //ПРАКТИКА
}

fun practice() {
    val map = mapOf<String, Int>()
    for (entry in map.entries)
        println("${entry.key} = ${entry.value}")
//Отправить все значения
    println(map.values)
    println(map.keys)

// Словарь в котором хранятся запасы продуктов на складе, если нет то выброси исключение
    val mapProduct = mapOf<String, Int>()
    println(mapProduct.getOrElse("apple") { throw Exception("not apple") })
    println(mapProduct.containsKey("apple")) // Есть ли фрукт на складе
    println(mapProduct.containsValue(10)) //Есть ли данное количество на складе

// Создать список элементами которого будут строки содержащие в себе Продукт стоит
    var listProduct = mapProduct.map { "Продукт ${it.key} стоит ${it.value}" }

    mapProduct.isEmpty()
    mapProduct.isNotEmpty()
    mapProduct.all { it.value > 10 }
    mapProduct.any { it.value > 100 }
    mapProduct.filterValues { it > 100 }
    mapProduct.toMutableMap()
    val mapProduct2 = mapProduct.toMutableMap()
    mapProduct2.putAll(mapOf())
    mapProduct2.clear()
}