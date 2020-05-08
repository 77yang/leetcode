package com.yang7;

import java.util.Arrays;

public class 移动零 {
    static class Solution {
        public void moveZeroes(int[] nums) {
            int zeroCont = 0;
            for (int i = 0; i < nums.length - zeroCont; ) {
                if (nums[i] == 0) {
                    for (int j = i + 1; j < nums.length - zeroCont; j++) {
                        nums[j - 1] = nums[j];
                    }
                    nums[nums.length - zeroCont - 1] = 0;
                    zeroCont++;
                }

                if (nums[i] != 0) {
                    i++;
                }
            }


            System.out.println(Arrays.toString(nums));

        }

        public static void main(String[] args) {
            int[] nums = new int[]{0, 1, 2, 3, 5};
            new Solution().moveZeroes(nums);

            nums = new int[]{0, 0, 1};
            new Solution().moveZeroes(nums);

            nums = new int[]{1,0,3,12,0};
            new Solution().moveZeroes(nums);

        }
    }
}
