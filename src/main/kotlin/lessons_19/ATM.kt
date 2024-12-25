package com.Nikita.lessons_19

class ATM(private var balance: Float = 0.0f) {
    private var pin = "2333"
    fun deposit(amount: Float, pin: String) {
        checkPin(pin)

    }

    fun withdraw(amount: Float, pin: String) {
        checkPin(pin)

    }

    fun getBalance(pin: String): Float {
        checkPin(pin)
        return balance
    }

    private fun checkPin(pin: String) {
        if (pin != this.pin)
            throw Exception("Пин неверный")
    }
}

