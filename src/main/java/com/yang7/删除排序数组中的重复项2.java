package com.yang7;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/
 * */
public class 删除排序数组中的重复项2 {
    static class Solution {

        public static int removeDuplicates(int[] nums) {

            if (nums == null) {
                return 0;
            }


            int i = 0;
            for (int n : nums) {
                if(i<2 || n>nums[i-2]) nums[i++] = n;
            }

            return i;

        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3, 4};
        System.out.println(Solution.removeDuplicates(nums));


        int[] nums1 = new int[]{1, 1, 2, 2, 3, 4};
        System.out.println(Solution.removeDuplicates(nums1));

    }
}
