//给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a ，b ，c ，使得 a + b + c = 0 ？请找出所有和为 0 且
//不重复 的三元组。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：nums = [0]
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 3000 
// -10⁵ <= nums[i] <= 10⁵ 
// 
//
// 
//
// 注意：本题与主站 15 题相同：https://leetcode-cn.com/problems/3sum/ 
// Related Topics 数组 双指针 排序 👍 41 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OneFGaJU {
    public static void main(String[] args) {
        Solution solution = new OneFGaJU().new Solution();
        System.out.println(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            if (null == nums || 3 > nums.length) {
                return new ArrayList<>();
            }
            Arrays.sort(nums);
            int lastNum = Integer.MAX_VALUE;
            List<List<Integer>> result = new ArrayList<>();
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == lastNum) {
                    continue;
                }
                lastNum = nums[i];
                int left = i + 1;
                int right = nums.length - 1;
                int target = -nums[i];
                int sum;
                while (left < right) {
                    sum = nums[left] + nums[right];
                    if (sum == target) {
                        result.add(Arrays.asList(lastNum, nums[left], nums[right]));
                        ++left;
                        while (left < right && nums[left] == nums[left - 1]) {
                            ++left;
                        }
                        --right;
                        while (left < right && nums[right] == nums[right + 1]) {
                            --right;
                        }
                    } else if (sum > target) {
                        --right;
                    } else {
                        ++left;
                    }
                }
            }
            return result;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}