package org.example.patterns

import kotlin.comparisons.maxOf

fun lengthOfLongestSubstring(s: String): Int {
    var left = 0
    var maxLen: Int = 0
    var hashSet: HashSet<Char> = hashSetOf()


    for (right in s.indices) {
        while (hashSet.contains(s[right])) {
            hashSet.remove(s[left])
            left++
        }
        hashSet.add(s[right])
        maxLen = maxOf(a = maxLen, b = (right - left + 1))
    }
    return maxLen
}

fun lengthOfLongestSubstringHashMap(s: String): Int {
    var left = 0
    var maxLen = 0
    val hashMap = HashMap<Char, Int>()

    for (right in s.indices) {
        if(hashMap.containsKey(s[right])) {
            left = maxOf(left,hashMap[s[right]]!! + 1)
        }

        hashMap[s[right]] = right
        maxLen = maxOf(maxLen, right - left + 1)
    }
    return maxLen
}

fun main() {
println(lengthOfLongestSubstring("abcabcbb"))
}