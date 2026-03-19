package org.example.tcs

fun merge2Arrays(a: IntArray, b: IntArray): MutableList<Int> {

    var p1 = 0
    var p2 = 0
    val newArr = mutableListOf<Int>()
    var i = 0
    (a+b).toSortedSet()

    while (p1 < a.size && p2 < b.size) {
        if (a[p1] > b[p2]) {
            newArr[i] = b[p2]
            p2++
        } else {
            newArr[i] = a[p1]
            p1++
        }
        i++
    }

    while (p1 < a.size) {
        //newArr.add
    }

    return newArr
}

fun main() {
    val m1 = intArrayOf(2,4,7)
    val m2 = intArrayOf(1,3,5)

    println(merge2Arrays(m1, m2).toList())
}