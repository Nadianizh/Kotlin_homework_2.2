package ru.netology

fun main() {
    val likes1 = 3001
    val likes2 = 111
    val likes3 = 1025

    printout(likes1)
    printout(likes2)
    printout(likes3)
}

fun printout(like: Int) {
    val people: String
    val lastDigit: Int
    val last2Digit: Int

    lastDigit = like % 10
    last2Digit = like % 100

    if (lastDigit == 1 && !(last2Digit == 11)) {
        people = "человеку"
    } else {
        people = "человекам"
    }

    println("Ваша запись нравится $like $people. ")
}

