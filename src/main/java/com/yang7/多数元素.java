package com.yang7;

public class 多数元素 {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int mostnum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == mostnum) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    mostnum = nums[i];
                    count++;
                }
            }
        }
        return mostnum;

    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        System.out.println(majorityElement(new int[]{5, 5, 1, 1, 1, 5, 5}));
        System.out.println(majorityElement(new int[]{3, 2, 3}));
    }
}
