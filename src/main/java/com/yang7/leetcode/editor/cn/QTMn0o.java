//给定一个整数数组和一个整数 k ，请找到该数组中和为 k 的连续子数组的个数。
//
// 
//
// 示例 1 : 
//
// 
//输入:nums = [1,1,1], k = 2
//输出: 2
//解释: 此题 [1,1] 与 [1,1] 为两种不同的情况
// 
//
// 示例 2 : 
//
// 
//输入:nums = [1,2,3], k = 3
//输出: 2
// 
//
// 
//
// 提示: 
//
// 
// 1 <= nums.length <= 2 * 10⁴ 
// -1000 <= nums[i] <= 1000 
// 
// -10⁷ <= k <= 10⁷ 
// 
// 
//
// 
//
// 注意：本题与主站 560 题相同： https://leetcode-cn.com/problems/subarray-sum-equals-k/ 
// Related Topics 数组 哈希表 前缀和 👍 46 👎 0


package com.yang7.leetcode.editor.cn;

public class QTMn0o {
    public static void main(String[] args) {
        Solution solution = new QTMn0o().new Solution();
        System.out.println(solution.subarraySum(new int[]{1, -1, 0}, 0));
        System.out.println(solution.subarraySum(new int[]{1, 1, 1}, 2));
        System.out.println(solution.subarraySum(new int[]{1,2,3}, 3));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int subarraySum(int[] nums, int k) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                int cur = i;
                int total = 0;
                while (true) {
                    total += nums[cur];


                    if (total == k) {
                        count++;

                    }
                    cur++;
                    if (cur >= nums.length) {
                        break;
                    }
                }
            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}