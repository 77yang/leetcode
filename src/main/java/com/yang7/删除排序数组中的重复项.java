package com.yang7;

public class 删除排序数组中的重复项 {
    static class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums==null) {
                return 0;
            }
            int i = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
            return i+1;

        }
    }
}
