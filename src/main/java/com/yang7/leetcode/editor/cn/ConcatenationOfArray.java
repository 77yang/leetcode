//给你一个长度为 n 的整数数组 nums 。请你构建一个长度为 2n 的答案数组 ans ，数组下标 从 0 开始计数 ，对于所有 0 <= i < n 的
// i ，满足下述所有要求： 
//
// 
// ans[i] == nums[i] 
// ans[i + n] == nums[i] 
// 
//
// 具体而言，ans 由两个 nums 数组 串联 形成。 
//
// 返回数组 ans 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,1]
//输出：[1,2,1,1,2,1]
//解释：数组 ans 按下述方式形成：
//- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//- ans = [1,2,1,1,2,1] 
//
// 示例 2： 
//
// 
//输入：nums = [1,3,2,1]
//输出：[1,3,2,1,1,3,2,1]
//解释：数组 ans 按下述方式形成：
//- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
//- ans = [1,3,2,1,1,3,2,1]
// 
//
// 
//
// 提示： 
//
// 
// n == nums.length 
// 1 <= n <= 1000 
// 1 <= nums[i] <= 1000 
// 
// Related Topics 数组 👍 21 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        Solution solution = new ConcatenationOfArray().new Solution();
        System.out.println(Arrays.toString(solution.getConcatenation(new int[]{1, 2, 1})));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] getConcatenation(int[] nums) {
            int length = nums.length;
            int[] target = new int[length * 2];
            for (int i = 0; i < length; i++) {
                target[i] = nums[i];
                target[i + length] = nums[i];
            }
            return target;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}