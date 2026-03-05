package org.example.tcs

fun minItem(list: IntArray): Int {
    var min = list[0]
    for (item in list) {
        if (item < min)
            min = item
    }
    return min
}

fun main() {
    println(minItem(intArrayOf(2,5,5,5,6,34,1)))
}