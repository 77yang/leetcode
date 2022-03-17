//给定一个二进制数组 nums , 找到含有相同数量的 0 和 1 的最长连续子数组，并返回该子数组的长度。
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [0,1]
//输出: 2
//说明: [0, 1] 是具有相同数量 0 和 1 的最长连续子数组。 
//
// 示例 2: 
//
// 
//输入: nums = [0,1,0]
//输出: 2
//说明: [0, 1] (或 [1, 0]) 是具有相同数量 0 和 1 的最长连续子数组。 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// nums[i] 不是 0 就是 1 
// 
//
// 
//
// 注意：本题与主站 525 题相同： https://leetcode-cn.com/problems/contiguous-array/ 
// Related Topics 数组 哈希表 前缀和 👍 42 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class A1NYOS {
    public static void main(String[] args) {
        Solution solution = new A1NYOS().new Solution();
        System.out.println(solution.findMaxLength(new int[]{0, 1, 0}));
        System.out.println(solution.findMaxLength(new int[]{0, 1}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
// 着道题我的第一思路是使用：刷给你从循环暴力解题的，但是很有可能会超时
// 官方的题解是：使用前缀和的解法，将数组中的0替换为-1，如果某个区间内的和如果为0就说明这个区间之间的和为0

// 为什么不需要更新相同key所对应的map:
// 这里map保存的是前n项和以及其最早出现的索引，为什么是最早出现的索引？
// 因为我们是从前往后遍历，而且题目要求的是最长的连续子数组
// 也就是相当与我们并不需要更新相同的map

// 为什么一开始要map.put(0,-1);
// 假如是[0,1]那么最长的自创长度因该为2，如果不初始(0,-1)的化就无法取得索引相减
// 因为如果没有初始（0，1）遍历到1的时候就是第一次出现0

    class Solution {
        public int findMaxLength(int[] nums) {
            // 创建一个变量保存最长的子数组
            int maxLength = 0;
            // 创建一个map将前缀和以及最早出现该前缀和的索引建立联系
            Map<Integer, Integer> map = new HashMap<>();
            // 创建一个变量记录前缀和
            int counter = 0;
            // 初始化图，避免第一次出现的和为零的前缀和就是所求
            map.put(counter, -1);
            int n = nums.length;
            // 遍历数组寻找相同的前缀和，从而获取0，1个数相同的区间
            for (int i = 0; i < n; i++) {
                int num = nums[i];
                if (num == 1) {
                    counter++;
                } else {
                    counter--;
                }
                // 如果出现了相同的前缀和，获取该区间的长度并于目前最长的子数组及逆行比较
                if (map.containsKey(counter)) {
                    int prevIndex = map.get(counter);
                    maxLength = Math.max(maxLength, i - prevIndex);
                } else {
                    // 如果是第一次出现的前缀和加入map中，不是第一次出现的不用理会
                    // 毕竟求得是最长的子串
                    map.put(counter, i);
                }
            }
            return maxLength;
        }
    }


//leetcode submit region end(Prohibit modification and deletion)

}