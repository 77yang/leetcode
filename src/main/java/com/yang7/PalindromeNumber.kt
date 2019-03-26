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
        var t = x
        if(x<0||x%10==0&&x!=0) return false
        var reverseVal = 0
        //12321
        while (t > reverseVal) {
            reverseVal = reverseVal * 10 + t % 10
            t /= 10
        }
        return reverseVal == t || t==reverseVal/10
    }
}