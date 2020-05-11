package com.yang7;

import java.util.HashMap;

public class 数组中出现次数超过一半的数字 {
    static class Solution {
        public int majorityElement(int[] nums) {
            int length = nums.length;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                Integer value = map.getOrDefault(num, 0);
                if (value >= length / 2 ) {
                    return num;
                }
                map.put(num, value + 1);

            }

            return nums[0];
        }

        public static void main(String[] args) {
            System.out.println(new Solution().majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
            System.out.println(new Solution().majorityElement(new int[]{2,2,1,1,1,2,2}));
        }
    }
}
