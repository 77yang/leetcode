package com.yang7

/***


https://leetcode.com/problems/container-with-most-water/

 */
class Solution {
    fun maxArea(height: IntArray): Int {
        var total=0
        height.forEachIndexed { index, i ->
            run {
                val x1 = index + 1
                val y1 = i

                println("($x1,$y1)")

                for (i in index+1..height.lastIndex) {
                    val x2=i+1
                    val y2=height[i]

                    val result = Math.min(y2, y1) * (x2 - x1)
                    total =  Math.max(total,result)


                }

            }
        }

        return total
    }
}


fun main() {
    println(Solution().maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
}