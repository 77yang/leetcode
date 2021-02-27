package com.yang7;

import java.util.HashMap;

public class 只出现一次的数字 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash_table = new HashMap<>();

        for (int i : nums) {
            hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) {
            if (hash_table.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }


    public static int singleNumber2(int[] nums) {
        int single = 0;
        for (int i : nums) {
            single = single ^= i;
        }
        return single;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber2(new int[]{2, 2, 1}));
    }

}
