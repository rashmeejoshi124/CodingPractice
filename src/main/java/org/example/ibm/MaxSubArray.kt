package org.example.ibm

fun maxSubArraySum(nums: IntArray): Int {
    var currentSum = 0
    var maxSum = nums[0]

    for (i in nums) {
        if (currentSum < 0) {
            currentSum = 0
        }
        currentSum += i
        if (currentSum > maxSum) {
            maxSum = currentSum
        }
    }
    return maxSum
}

fun checkPrime() {
    val no = 50

    when(no) {
        0 -> println(false)
        2,3 -> println(true)
        
    }
    if (no < 0)
        println("false")

}

fun maxSubArray(nums: IntArray): List<Int> {
    var currentSum = nums[0]
    var maxSum = nums[0]

    var start = 0
    var end = 0
    var tempStart = 0

    for (i in 1 until nums.size) {
        if (nums[i] > currentSum + nums[i]) {
            currentSum = nums[i]
            tempStart = i
        } else {
            currentSum += nums[i]
        }
        if (currentSum > maxSum) {
            maxSum = currentSum
            start = tempStart
            end = i
        }
    }
    println("$start + $end")
    return nums.slice(start..end)
}

fun main() {
    val nums = intArrayOf(-2,1,-3,4,-1,2,1,-5,4)
    val nums2 = intArrayOf(-3,-2,-1)
    val nums3 = intArrayOf(2, -1, 2, 3, 4, -5)
    val nums4 = intArrayOf(4, -1, 2, 1, -10, 5)
    val nums5 = intArrayOf(-2, 1)
    println(maxSubArray(nums5))
}