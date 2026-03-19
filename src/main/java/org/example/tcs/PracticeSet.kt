package org.example.tcs

fun reverseWordsInASentence(input: String): String {
    val keywordList = input.split(" ")
    return keywordList.reversed().joinToString(" ")
}


fun removeDuplicatesFromArray(arr: IntArray): IntArray {
    val hashSet = HashSet<Int>()
    for (i in arr) {
        hashSet.add(i)
    }
    return hashSet.toIntArray()
}

fun findPairWithGivenSum(arr: IntArray, sum: Int): Pair<Int, Int> {
    val sumArr = hashMapOf<Int, Int>()

    for (i in arr.indices) {
        val res = sum - arr[i]
        if (sumArr.contains(res)) {
            return Pair(res, arr[i])
        }
        sumArr[arr[i]] = res
    }
    return (0 to 0)
}

fun extractAndAdd(input: String = "abc123xyz45"): Int {

    val regex = Regex("\\d+")

    return regex.findAll(input).sumOf { it.value.toInt() }
}

fun printPattern() {
    for (i in 0..5) {
        for (j in 0..i) {
            print("*")
        }
        println()
    }
}

fun reverseArray() {
    val arr = intArrayOf(2,4,7,56)
    val list = mutableListOf<Int>()
    for (i in (arr.size -1)downTo 0) {
        list.add(arr[i])
    }
    println(list)
}

fun largestAndSecondLargest() {
    val arr = intArrayOf(3,61,7,34,56,7)
    var max = Int.MIN_VALUE
    var secLarg: Int = Int.MIN_VALUE
    for (i in arr) {
        if (i > max) {
            secLarg = max
            max = i
        } else {
            if (i > secLarg && i != max) {
                secLarg = i
            }
        }
    }
    println("$max -- $secLarg")
}


fun main() {
    println(reverseWordsInASentence("i love android"))
    println(removeDuplicatesFromArray(intArrayOf(2,4,5,6,6,7,2,5,6,7)).toList())
    println(findPairWithGivenSum(intArrayOf(5,6,1,2,3), 11))
    println(extractAndAdd())
    printPattern()
    reverseArray()
    largestAndSecondLargest()
    println(intArrayOf(2,2,4,5,4,5,43,43,12,233,12).distinct())
}