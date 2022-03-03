//给你一个整数数组 nums ，返回数组中最大数和最小数的 最大公约数 。
//
// 两个数的 最大公约数 是能够被两个数整除的最大正整数。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [2,5,6,9,10]
//输出：2
//解释：
//nums 中最小的数是 2
//nums 中最大的数是 10
//2 和 10 的最大公约数是 2
// 
//
// 示例 2： 
//
// 输入：nums = [7,5,6,8,3]
//输出：1
//解释：
//nums 中最小的数是 3
//nums 中最大的数是 8
//3 和 8 的最大公约数是 1
// 
//
// 示例 3： 
//
// 输入：nums = [3,3]
//输出：3
//解释：
//nums 中最小的数是 3
//nums 中最大的数是 3
//3 和 3 的最大公约数是 3
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 1000 
// 1 <= nums[i] <= 1000 
// 
// Related Topics 数组 数学 数论 👍 12 👎 0


package com.yang7.leetcode.editor.cn;

public class FindGreatestCommonDivisorOfArray {
    public static void main(String[] args) {
        Solution solution = new FindGreatestCommonDivisorOfArray().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int gcd(int a, int b) {
            int temp;
            while (a % b != 0) {
                temp = b;
                b = a % b;
                a = temp;
            }
            return b;
        }

        public int findGCD(int[] nums) {
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            for (int n : nums) {
                if (n > max) max = n;
                if (n < min) min = n;
            }
            return gcd(max, min);
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}