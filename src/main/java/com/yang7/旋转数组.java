package com.yang7;

import java.util.Arrays;

public class 旋转数组 {
   static class Solution {
        public void rotate(int[] nums, int k) {

            int lastIndex = nums.length - 1;
            while (k > 0) {
                int temp = nums[lastIndex];

            }


            System.out.println(Arrays.toString(nums));

        }

      public void move(int[] nums) {
//          int temp = nums[k];
//          nums[k] = nums[i];
//          nums[i] = temp;
       }

       public static void main(String[] args) {
           int[] arr = {1, 2, 3, 4, 5, 6};
           new Solution().rotate(arr,2);
       }
    }
}
