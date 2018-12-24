package com.yang7

/**
 * https://leetcode.com/problems/regular-expression-matching/
 *


'.' Matches any single character.
'*' Matches zero or more of the preceding element.

Input:
s = "aab"
p = "c*a*b"
Output: true
Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore it matches "aab".



Input:
s = "mississippi"
p = "mis*is*p*."
Output: false

 */
object RegularExpressionMatching {

    fun isMatch(source: String, pattern: String): Boolean {
        if (source.isBlank() || pattern.isBlank()) {
            return false
        }

        if (pattern.startsWith("*")) {
            return false
        }


        var sIndex = 0

        var pIndex = 0
        while (true) {
            val s = source[sIndex]
            val p = pattern[pIndex]

            if(p !in (".*$s")){
                return false

            }

            if (p == '*') {

                if (pattern[pIndex-1] in ".$s") {
                    sIndex++

                } else {
                    pIndex++
                }



            }

            if (p == '.') {
                sIndex++
                pIndex++
            }


            if (p == s) {
                sIndex++
                pIndex++
            }


        }


        return true
    }
}