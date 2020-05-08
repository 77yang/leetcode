package com.yang7;

import java.util.Arrays;

public class 加一 {
  static   class Solution {
        public int[] plusOne(int[] digits) {
            for (int i = digits.length-1; i >=0; i--) {
                int digit = digits[i];
                if (digit < 9) {
                    digits[i] += 1;
                    break;
                }
                digits[i] = 0;
            }
            if (digits[0] == 0) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
            }

            System.out.println(Arrays.toString(digits));
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] digits = {1,2,3,9};
        System.out.println(new Solution().plusOne(digits));
    }
}
