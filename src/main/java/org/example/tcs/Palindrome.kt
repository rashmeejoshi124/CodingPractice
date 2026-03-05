package org.example.tcs

fun palindrome(no: Int): Boolean {
    if (no < 0) return false

    return no.toString() == no.toString().reversed()
}

fun main() {
    println(palindrome(565))
}