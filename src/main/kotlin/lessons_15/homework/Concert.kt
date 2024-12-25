package com.Nikita.lessons_15.homework

class Concert(
    val band: String,                // Группа
    val venue: String,               // Место проведения
    val ticketPrice: Double,         // Стоимость билета
    val venueCapacity: Int) {

    private var soldTickets: Int = 0  // Приватное поле "проданные билеты"

    // Метод для вывода информации о концерте
    fun showConcertInfo() {
        println("Концерт группы: $band")
        println("Место проведения: $venue")
        println("Стоимость билета: $ticketPrice руб.")
        println("Вместимость зала: $venueCapacity")
        println("Проданные билеты: $soldTickets")
    }

    // Метод для покупки билета
    fun buyTicket() {
        if (soldTickets < venueCapacity) {
            soldTickets++
            println("Билет куплен! Проданные билеты: $soldTickets")
        } else {
            println("Извините, все билеты распроданы!")
        }
    }
}

