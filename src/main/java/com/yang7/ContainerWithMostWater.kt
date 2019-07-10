package com.yang7

/***


https://leetcode.com/problems/container-with-most-water/

 */
class Solution {
    fun maxArea(height: IntArray): Int {
        var total=0
        var count=0
        height.forEachIndexed { index, i ->
            run {
                val x1 = index
                val y1 = i
                for (i in index..height.lastIndex) {
                    val x2=i
                    val y2=height[i]
                    val result = Math.min(y2, y1) * (x2 - x1)
                    total =  Math.max(total,result)
                    count++

                }
            }
        }

        println(count)
        return total
    }


    fun maxArea_v2(height: IntArray): Int {
        var total=0
        var start=0
        var count=0
        var end= height.lastIndex
        while (start < end) {
            val y1 = height[start]
            val y2 = height[end]

            total =  Math.max ((end-start) * Math.min(y1, y2),total)
            count++
            if (y1 > y2)
                end--
            else
                start++
        }

        println(count)
        return total
    }
}


fun main() {
    println(Solution().maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
    println(Solution().maxArea_v2(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
}