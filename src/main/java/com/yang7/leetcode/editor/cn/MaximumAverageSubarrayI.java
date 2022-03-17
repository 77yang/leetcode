//给你一个由 n 个元素组成的整数数组 nums 和一个整数 k 。
//
// 请你找出平均数最大且 长度为 k 的连续子数组，并输出该最大平均数。 
//
// 任何误差小于 10⁻⁵ 的答案都将被视为正确答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,12,-5,-6,50,3], k = 4
//输出：12.75
//解释：最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
// 
//
// 示例 2： 
//
// 
//输入：nums = [5], k = 1
//输出：5.00000
// 
//
// 
//
// 提示： 
//
// 
// n == nums.length 
// 1 <= k <= n <= 10⁵ 
// -10⁴ <= nums[i] <= 10⁴ 
// 
// Related Topics 数组 滑动窗口 👍 229 👎 0


package com.yang7.leetcode.editor.cn;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        Solution solution = new MaximumAverageSubarrayI().new Solution();
        System.out.println(solution.findMaxAverage(new int[]{0, 1, 1, 3, 3}, 4));
        System.out.println(solution.findMaxAverage(new int[]{5}, 1));
        System.out.println(solution.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            if (k > nums.length || nums.length == 0) {
                return 0.0;
            }
            double maxsum = 0;
            double sum = 0;
            //第一个窗口的和
            for (int i = 0; i < k; ++i) {
                sum += nums[i];
            }
            //保存
            maxsum = sum;
            //求出最大和
            for (int j = k; j < nums.length; ++j) {
                sum = sum + nums[j] - nums[j - k];
                maxsum = Math.max(maxsum, sum);
            }
            //返回
            return maxsum / k;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}