package org.example.gfg


fun main() {
    println(secondLargest(intArrayOf(12, 12, 8, 10, 5)))
    println(intArrayOf(12, 12, 112, 118, 118).removeDuplicatesFromSortedArray().toList())
    println(intArrayOf(12,0,6,0,9,0,40,22,112,0,0,4,6).moveZerosToEnd().toList())
}

/**
 * find second largest
 */
fun secondLargest(nums: IntArray): Int {
    // we will store index
    var largest = 0
    var secondLargest = -1

    for (i in nums.indices) {

        if (nums[i] >= nums[largest]) {
            //assigning i into largest
            val temp = largest
            largest = i
            secondLargest = temp
        } else {
            // if we haven't found secondLargest or item > secLarg
            if (secondLargest == -1 || nums[i] >= nums[secondLargest]) {
                secondLargest = i
            }
        }
    }
    return nums[secondLargest]
}

fun IntArray.isArraySorted(): Boolean {
    for (i in 0 until (size - 1)) {
        if (this[i] <= this[i + 1]) {
            continue
        } else
            return false
    }
    return true
}

fun IntArray.removeDuplicatesFromSortedArray(): IntArray {
    var position = 1

    for (i in 1 until size) {
        if (this[i] != this[i - 1]) {
            this[position] = this[i]
            position++
        }
    }
    return this
}

fun IntArray.moveZerosToEnd(): IntArray {
    var loc = 0
    for (i in 0 until size) {
        if (this[i] != 0 ) {
            swapElements(i, loc)
            loc++
        }
    }
    return this
}

fun IntArray.swapElements(index1: Int, index2: Int): IntArray {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
    return this
}