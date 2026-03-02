package org.example.ibm

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    return s.toCharArray().sorted() == t.toCharArray().sorted()
}

fun isAnagramDSA(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val freq = IntArray(26)

    for (i in s.indices) {
        freq[s[i] - 'a']++
        freq[t[i] - 'a']--
    }

    for (count in freq) {
        if(count != 0) return false
    }
    return true
}

fun main() {
    println(isAnagramDSA("abcrb","bcrab"))
}