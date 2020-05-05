package com.yang7.sword2offer;

public class 青蛙跳台阶问题 {

    static class Solution {
        public int numWays(int n) {
            int count = 1, b = 1, sum = 0;
            for (int i = 0; i < n; i++) {
                sum = (count + b) % 1000000007;
                count = b;
                b = sum;
            }
            return count;
        }
    }
}


