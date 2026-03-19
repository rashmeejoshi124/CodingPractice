package org.example.fifteen.dayone

/*
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up
  to target.
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
* */
fun twoSum(nums: IntArray, target: Int): IntArray {
    val hashMap = hashMapOf<Int, Int>()

    for (i in nums.indices) {
        val diff = target - nums[i]
        if (hashMap.containsKey(diff)) {
            val x = hashMap[diff] ?: 0
            return intArrayOf(x, i)
        } else {
            hashMap[nums[i]] = i
        }
    }
    return intArrayOf(0,0)
}

fun main() {
 println(twoSum(intArrayOf(2,7,11,15), 9).toList())
}