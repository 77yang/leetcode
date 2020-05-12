package com.yang7;

import java.util.Arrays;

public class 和为s的两个数字 {

    static class Solution {

        public int[] twoSum(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left != right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    return new int[]{nums[left],nums[right]};
                }

                if (sum > target) {
                    right--;
                }
                if (sum < target) {
                    left++;
                }
            }
            return new int[]{};
        }

        public static void main(String[] args) {
            int[] arrays = new Solution().twoSum(new int[]{1, 2, 3, 4, 5}, 5);
            System.out.println(Arrays.toString(arrays));
        }
    }
}
