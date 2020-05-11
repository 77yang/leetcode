package com.yang7;

public class 连续子数组的最大和 {
   static class Solution {
        public int maxSubArray(int[] nums) {
            int sum = nums[0];
            for (int i = 1; i < nums.length; i++) {
                nums[i] += Math.max(nums[i - 1], 0);
                sum = Math.max(sum, nums[i]);
            }
            return sum;
        }
    }
}
