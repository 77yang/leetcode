package com.yang7

/**
 * https://leetcode.com/problems/palindrome-number/
 * 1
 * -1
 *
 *
 */
object PalindromeNumber {

    fun isPalindrome(x: Int): Boolean {
        if (x == null) {
            return false
        }

        val str = x.toString()
        val length = str.length

        if (length == 1) {
            return true
        }

        var i = 0
        while (i <= length - i-1) {
            if (str[i] != str[length - i-1]) {
                return false
            }
            i++
        }

        return true
    }
}