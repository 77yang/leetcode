package com.yang7

import java.math.BigInteger

/**
 * https://leetcode.com/problems/string-to-integer-atoi/


Example 1:
Input: "42"
Output: 42



Example 2:
Input: "   -42"
Output: -42
Explanation: The first non-whitespace character is '-', which is the minus sign.
Then take as many numerical digits as possible, which gets 42.


Example 3:
Input: "4193 with words"
Output: 4193
Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.


Example 4:
Input: "words and 987"
Output: 0
Explanation: The first non-whitespace character is 'w', which is not a numerical
digit or a +/- sign. Therefore no valid conversion could be performed.



Example 5:
Input: "-91283472332"
Output: -2147483648
Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
Thefore INT_MIN (−231) is returned.

+
+-2

 */
object StringtoInteger{
    fun myAtoi(str: String): Int {

        var str = str.trim()


        val example = "-+0123456789"
        val length = str.length


        var i=1
        while(i< length&&length>1){
            if (!str[i].isDigit()) {
                str = str.substring(0, i)
                break
            }
            i++
        }

        val num: BigInteger
        try {
            num = BigInteger(str)
        } catch (e: Exception) {
            return 0
        }

        if (num.compareTo(Int.MAX_VALUE.toBigInteger()) > 0) {
            return Int.MAX_VALUE

        }


        if (num.compareTo(Int.MIN_VALUE.toBigInteger()) < 0) {
            return Int.MIN_VALUE

        }
        return str.toInt()
    }
}