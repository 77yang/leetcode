package com.yang7.sword2offer;

public class 数值的整数次方 {
    static class Solution {
        public double myPow(double x, int n) {
            double sum = 1.0;
            long b = n;
            if (b < 0) {
                x = 1 / x;
                b = -b;
            }
            if (b == 0) {
                return 1;
            }
            while (b > 0) {
                if ((b & 1) == 1) {
                    sum *= x;
                }
                x *= x;
                b >>= 1;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().myPow(2.00000, -2));//0.25
        System.out.println(new Solution().myPow(2.10000, 3));//9.261
        System.out.println(new Solution().myPow(2, 3));//8
        System.out.println((byte)01111111);
    }

}
