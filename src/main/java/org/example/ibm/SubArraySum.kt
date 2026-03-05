package org.example.ibm

fun subarraySum(nums: IntArray, k: Int): Int {
    val hashMap = HashMap<Int, Int>()
    var sum = 0
    hashMap[0] = 1
    var arrCount = 0
    for (i in 1 until nums.size) {
        sum += nums[i]
        val prefix = sum - k
        if (hashMap.containsValue(prefix)) {
            arrCount++
        }
        hashMap[i] = prefix
        println("$i - $prefix")
    }
    return arrCount
}


fun main() {
    val nums = intArrayOf(1, 1, 1)
    val k = 2
    println(subarraySum(nums, k))
}