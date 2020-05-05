package com.yang7.sword2offer;

public class 二进制中1的个数 {
    static public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int count = 0;
            while (n != 0) {
                count++;
                n = n & n - 1;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().hammingWeight(3));
        System.out.println(new Solution().hammingWeight(4));
        System.out.println(new Solution().hammingWeight(0));
    }
}
