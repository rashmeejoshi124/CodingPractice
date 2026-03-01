package org.example.patterns

fun longestSubarrayWithSumAtMostK(arr: IntArray, k: Int): Int {

    var sum = 0
    var left = 0
    var maxLength = 0

    for (i in arr.indices) {
        sum += arr[i]

        while (sum > k) {
            sum -= arr[left]
            left++
        }

        maxLength = maxOf(maxLength, i - left + 1)
    }
    return maxLength
}

fun main() {
    val arr = intArrayOf(1, 2, 1, 0, 1, 1, 0)
    val sum = longestSubarrayWithSumAtMostK(arr, 4)
    println(sum)
}