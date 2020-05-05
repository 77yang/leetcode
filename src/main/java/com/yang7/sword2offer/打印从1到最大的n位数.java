package com.yang7.sword2offer;

import java.util.Arrays;

public class 打印从1到最大的n位数 {
    static class Solution {
        public int[] printNumbers(int n) {

            if (n == 0) {
                return new int[]{};
            }
            int max = 1;

            while (n-- > 0) {
                max *= 10;
            }
            max -= 1;
            int[] arr = new int[max];

            for (int i = 0; i < max; i++) {
                arr[i] = i + 1;
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().printNumbers(2)));
        System.out.println(Arrays.toString(new Solution().printNumbers(3)));
        System.out.println(Arrays.toString(new Solution().printNumbers(4)));
    }
}
