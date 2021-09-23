package ru.netology

fun main() {
    val totalPrice = 1001_00
    val musicLover = true

    val sum = if (musicLover) {
        when (totalPrice) {
            in 1..1000_00 -> {
                totalPrice - totalPrice * 1 / 100
            }
            in 1001_00..10000_00 -> {
                val tmp = totalPrice - 100_00
                tmp - tmp * 1 / 100
            }
            else -> {
                val tmp = totalPrice - totalPrice * 5 / 100
                tmp - tmp * 1 / 100
            }
        }
    } else {
        when (totalPrice) {
            in 1..1000_00 -> {
                totalPrice - totalPrice * 1 / 100
            }
            in 1001_00..10000_00 -> {
                totalPrice - 100_00
            }
            else -> {
                totalPrice - totalPrice * 5 / 100
            }
        }
    }
    val resultRub = sum / 100
    val resultKop = sum % 100
    print("Цена с учетом скидки $resultRub руб. $resultKop коп.")
}
