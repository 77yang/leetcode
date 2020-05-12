package com.yang7;

public class 爬楼梯 {
    static class Solution {
        public int climbStairs(int n) {
            if (n==1) {
                return n;
            }
            int[] dp = new int[n + 1];
            dp[1] = 1;
            dp[2] = 2;
            for (int i = 3; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n];
        }

        public static void main(String[] args) {
            System.out.println(new Solution().climbStairs(2));
        }

    }
}
