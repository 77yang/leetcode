package com.yang7

/**
 *
https://leetcode.com/problems/longest-common-prefix/

Input: ["flower","flow","flight"]
Output: "fl"

Input: ["dog","racecar","car"]
Output: ""

Explanation: There is no common prefix among the input strings.
 */

/**
 * 	Time Limit Exceeded
 */
fun longestCommonPrefixV1(strs: Array<String>): String {
    var i = 0
    var s = ""
    while (i > -1) {
        var ss = mutableSetOf<Char>()
        for (str in strs) {
            val value = if (str.lastIndex >= i) str[i] else ' '
            ss.add(value)
        }
        if (ss.size == 1) {
            s += ss.first()
            ss.clear()
        } else {
            break
        }
        i++
    }
    return s

}

fun longestCommonPrefixV2(strs: Array<String>): String {
    if (strs.isEmpty()) {
        return ""
    }

    var pre = strs[0]
    var i = 1

    while (i < strs.size) {
        while (strs[i].indexOf(pre) != 0) {
            pre = pre.substring(0, pre.length - 1)
        }
        i++
    }

    return pre

}

fun main() {
    println(longestCommonPrefixV1(arrayOf("dog", "racecar", "car")))
    println(longestCommonPrefixV2(arrayOf("flower", "flow", "flight")))
}