package com.yang7;

public class 和为K的子数组 {
   static class Solution {
        public int subarraySum(int[] nums, int k) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                int sum = 0;
                for (int j = i; j >=0 ; j--) {
                    sum += nums[j];
                    if (sum==k) {
                        count++;
                    }
                }
            }
            return count;

        }
    }
}
