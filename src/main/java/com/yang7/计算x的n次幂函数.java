package com.yang7;

public class 计算x的n次幂函数 {
    static class Solution {
        public double quickMul(double x, long N) {
            if (N == 0) {
                return 1.0;
            }
            double y = quickMul(x, N / 2);
            return N % 2 == 0 ? y * y : y * y * x;
        }

        public double myPow(double x, int n) {
            long N = n;
            return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
        }


        public static void main(String[] args) {
            System.out.println(new Solution().myPow(2, 2));
            System.out.println(new Solution().myPow(2.1, 2));
            System.out.println(new Solution().myPow(2.1, -2));
            System.out.println(new Solution().myPow(2, -2));
        }
    }


}
