package org.example.tcs

fun diagonalSum(matrix: Array<IntArray>): Int {

    var sum = 0
    for (i in matrix.indices) {
        sum += matrix[i][i]
    }
    return sum
}




fun main() {
    val rows = 3
    val cols = 3
    val matrix = Array(rows){ IntArray(cols) { 1 } }

    val matrix2 = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    println(diagonalSum(matrix2))
}