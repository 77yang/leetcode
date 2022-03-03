//给你一个整数数组 nums ，统计并返回在 nums 中同时至少具有一个严格较小元素和一个严格较大元素的元素数目。
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [11,7,2,15]
//输出：2
//解释：元素 7 ：严格较小元素是元素 2 ，严格较大元素是元素 11 。
//元素 11 ：严格较小元素是元素 7 ，严格较大元素是元素 15 。
//总计有 2 个元素都满足在 nums 中同时存在一个严格较小元素和一个严格较大元素。
// 
//
// 示例 2： 
//
// 
//输入：nums = [-3,3,3,90]
//输出：2
//解释：元素 3 ：严格较小元素是元素 -3 ，严格较大元素是元素 90 。
//由于有两个元素的值为 3 ，总计有 2 个元素都满足在 nums 中同时存在一个严格较小元素和一个严格较大元素。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 100 
// -10⁵ <= nums[i] <= 10⁵ 
// 
// Related Topics 数组 排序 👍 8 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.Arrays;

public class CountElementsWithStrictlySmallerAndGreaterElements {
    public static void main(String[] args) {
        Solution solution = new CountElementsWithStrictlySmallerAndGreaterElements().new Solution();
        System.out.println(solution.countElements(new int[]{71, -71, 93, -71, 40}));
        System.out.println(solution.countElements(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        System.out.println(solution.countElements(new int[]{1, 7, 2, 15}));
        System.out.println(solution.countElements(new int[]{-3, 3, 3, 90}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countElements(int[] nums) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int cmin = 0;
            int cmax = 0;
            for (int v : nums) {
                if (v < min) {
                    min = v;
                    cmin = 1;
                } else if (v == min) cmin++;
                if (v > max) {
                    max = v;
                    cmax = 1;
                } else if (v == max) cmax++;
            }

            if (max == min) return 0;
            return nums.length - cmax - cmin;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}