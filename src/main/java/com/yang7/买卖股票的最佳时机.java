package com.yang7;

public class 买卖股票的最佳时机 {
   static class Solution {
        public int maxProfit(int[] prices) {

            int max = 0;

            for (int i = 0; i < prices.length; i++) {
                for (int j = i;  j < prices.length; j++) {
                    int profit = prices[j] - prices[i];
                    if (profit <= 0) {
                        continue;
                    }
                    max = Math.max(max, profit);
                }
            }
            return max;
        }
    }
}
