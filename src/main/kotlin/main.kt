package ru.netology

fun main() {
    val likes1 = 313
    val likes2 = 12
    val likes3 = 1024

    printout(likes1)
    printout(likes2)
    printout(likes3)
}

fun printout(like: Int) {
    val people: String
    val lastDigit: Int
    val last2Digit: Int
    lastDigit = like - ((like / 10).toInt()) * 10
    last2Digit = like - ((like / 100).toInt()) * 100

    if ((lastDigit > 1 && lastDigit < 5) && !(last2Digit > 10 && last2Digit < 20)) {
        people = "человека"
    } else {
        people = "человек"
    }

    println("Вашу запись лайкнули $like $people. ")
}

