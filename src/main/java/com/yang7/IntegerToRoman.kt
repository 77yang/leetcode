package com.yang7

/**
 * https://leetcode.com/problems/integer-to-roman/
 *
 *
 *

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

Input: 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999.

 3999=MMM CM XC IX

2987=2000*2+1000-100+100-2*10+5+2*1

2987=2000*2+1000-100+50+3*10+5+2*1

 aM+

 */
fun v1(num: Int): String {
    var M= arrayOf("","M","MM","MMM")
    var C= arrayOf("","C","CC","CCC","CD","D","DC","DCC","DCCC","CM")
    var X= arrayOf("","X","XX","XXX","XL","L","LX","LXX","LXXX","XC")
    var I= arrayOf("","I","II","III","IV","V","VI","VII","VIII","IX")
    return M[num/1000]+C[num%1000/100]+X[num%100/10]+I[num%10]
}

fun v2(num: Int): String {
    val M= arrayOf(arrayOf("","M","MM","MMM")
            ,arrayOf("","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"),
            arrayOf("","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"),
            arrayOf("","I","II","III","IV","V","VI","VII","VIII","IX"))
    return M[0][num/1000]+M[1][num%1000/100]+M[2][num%100/10]+M[3][num%10]

}

fun v3(num: Int):String {
    val value= arrayOf(1000,900,500,400,100,90,50,40,10,9,5,4,1)
    val strArr = arrayOf("M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I")
    var s = ""
    var total = num

    for (i in 0 until value.size) {
        while (total >= value[i]) {
            total-=value[i]
            s+=strArr[i]
        }
    }
  return  s
}

fun main() {
    println(v1(1994)=="MCMXCIV")
    println(v2(3999)=="MMMCMXCIX")
    println(v3(3999)=="MMMCMXCIX")
}