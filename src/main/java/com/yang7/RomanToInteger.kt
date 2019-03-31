package com.yang7

/**
 * https://leetcode.com/problems/roman-to-integer/


Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000


input: 'MCMXCIV'
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

M CM XC IV
 */
fun RomanToInteger_v1(s: String): Int {
    val map: Map<Char, Int> = mapOf('I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000)

    var total = 0
    val length = s.length
    var i = 0
    while (i < length) {
        val first = map.getOrDefault(s[i], 0)
        if (i + 1 < length) {
            val second = map.getOrDefault(s[i + 1], 0)
            if (first < second) {
                total += second - first
                i += 2
                continue
            }
        }

        total += first
        i++
    }
    return total
}

fun main() {
    println(RomanToInteger_v1("MCMXCIV"))
    println(RomanToInteger_v1("III"))
}