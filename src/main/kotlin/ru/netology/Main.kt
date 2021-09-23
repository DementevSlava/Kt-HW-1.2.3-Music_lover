package ru.netology

fun main() {
    val totalPrice = 1001_00
    val musicLover = true
    val condition1 = 1..1000
    val condition2 = 1001_00..10000_00
    val fixedDiscount = 100
    val onePercent = 1 / 100
    val fivePercent = 5 / 1000

    val sum = if (musicLover) {
        when (totalPrice) {
            in condition1 -> {
                totalPrice - totalPrice * onePercent
            }
            in condition2 -> {
                val tmp = totalPrice - fixedDiscount
                tmp - tmp * onePercent
            }
            else -> {
                val tmp = totalPrice - totalPrice * fivePercent
                tmp - tmp * onePercent
            }
        }
    } else {
        when (totalPrice) {
            in condition1 -> {
                totalPrice - totalPrice * onePercent
            }
            in condition2 -> {
                totalPrice - fixedDiscount
            }
            else -> {
                totalPrice - totalPrice * fivePercent
            }
        }
    }
    val resultRub = sum / 100
    val resultKop = sum % 100
    print("Цена с учетом скидки $resultRub руб. $resultKop коп.")
}
