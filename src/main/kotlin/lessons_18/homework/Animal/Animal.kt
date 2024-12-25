package com.Nikita.lessons_18.homework.Animal


fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird())
    animals.forEach { it.makesound() }
}

abstract class Animal {
    open fun makesound() {
        println("This animal makes no sound.")
    }
}
//    Задания для отработки переопределения методов
//    Животные и Их Звуки
//    Базовый класс: Animal с методом makeSound().
//    Классы наследники: Dog, Cat, Bird.
//    Базовый метод makeSound() в классе Animal выводит "This animal makes no sound."
//    Переопределите метод makeSound() в каждом классе-наследнике, чтобы Dog выводил "Bark", Cat - "Meow", Bird -
//    "Tweet". Обогати вывод звуков цветом.
//    Создайте список животных List<Animal> и вызовите в цикле метод makeSound()








