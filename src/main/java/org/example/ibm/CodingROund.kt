package org.example.ibm


//we use hashmap to store item-index, then we do target-item = x, then if x exists in hashmap. we got result else keep continuing
fun twoSum(nums: IntArray, target: Int): IntArray {
    val hashMap = HashMap<Int, Int>()
    for (i in nums.indices) {
        val x = target - nums[i]
        if (hashMap.containsKey(x)) {
            return intArrayOf(hashMap[x]!!, i)
        }
        hashMap[nums[i]] = i
    }
    return intArrayOf()
}

//if item exists more than n/2 times - it's a major element - O(n)
fun majorityElement(nums: IntArray): Int {
    val hashMap = HashMap<Int, Int>()
    val maxCount = nums.size / 2
    for (i in nums) {
        hashMap[i] = hashMap.getOrDefault(i, 0) + 1
        if (hashMap[i]!! > maxCount) {
            return i
        }
    }
    return -1
}

fun majorityElementO1(nums: IntArray): Int {
    var count = 0
    var candidate = nums[0]
    for (i in nums) {
        if (count == 0) {
            candidate = i
        }
        if (candidate == i)
            count++
        else
            count--
    }
    return candidate
}

fun main() {
    val nums = intArrayOf(3, 3)
    val target = 6
    //println(twoSum(nums, target).toList())

    val arr = intArrayOf(2,2,1,2,1,2,2,3,3,)
    println(majorityElementO1(arr))
}