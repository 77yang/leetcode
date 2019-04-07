package com.yang7

/**
 * https://leetcode.com/problems/3sum/
 *
 *
 *
 *
Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
[-1, 0, 1],
[-1, -1, 2]
]

 */


/**
 * *
Time Limit Exceeded

 */
fun threeSumV1(nums: IntArray): List<List<Int>> {
    val size = nums.size
    nums.sort()
    val list = mutableListOf<List<Int>>()
    var str = mutableSetOf<String>()
    for (i in 0 until size - 2)
        for (j in i + 1 until size - 1)
            for (k in j + 1 until size) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    val element = listOf(nums[i], nums[j], nums[k])
                    if (str.add(element.toString()))
                        list.add(element)
                }
            }
    return list
}


fun threeSumV2(nums: IntArray): List<List<Int>> {
    nums.sort()
    val list = mutableListOf<List<Int>>()
    for (i in 0 until nums.size - 2) {

        if (!(i == 0 || nums[i] != nums[i - 1])) {
            //remove duplicate data
            continue
        }

        var left = i + 1
        var right = nums.size - 1
        var sum = 0 - nums[i]
        while (left < right) {
            val total = nums[left] + nums[right]
            when {
                total == sum -> {
                    list.add(listOf(nums[i], nums[left], nums[right]))
                    while (left < right && nums[left] == nums[left + 1]) left++
                    while (left < right && nums[right] == nums[right - 1]) right--
                    left++
                    right--
                }
                total < sum -> left++
                else -> right--
            }
        }
    }
    return list
}

fun main() {
    println(listOf(-1, 0, 1, 2, -1, -4).sorted())
    println(threeSumV2(intArrayOf(-1, 0, 1, 2, -1, -4)))
}