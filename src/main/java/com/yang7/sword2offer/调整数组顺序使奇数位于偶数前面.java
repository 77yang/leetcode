package com.yang7.sword2offer;

import java.util.Arrays;

public class 调整数组顺序使奇数位于偶数前面 {
   static class Solution {
        public int[] exchange(int[] nums) {
            int length = nums.length;
            int start = 0;
            int end = length - 1;
            if (nums == null || length < 2) {
                return nums;
            }
            int[] arr = new int[length];
            for (int i = 0; i <length; i++) {
                int num = nums[i];
                if (num % 2 != 0) {
                    arr[start++] = num;
                } else {
                    arr[end--] = num;
                }
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().exchange(new int[]{1, 2, 3, 4})));
    }
}
