package com.yang7.sword2offer;

public class 旋转数组的最小数字 {

   static class Solution {
        public int minArray(int[] numbers) {
            int i = 0;
            int j = numbers.length - 1;

            while (i < j) {
                int middle = (i + j) / 2;
                if (numbers[middle] > numbers[j]) {
                    i = middle + 1;
                } else if (numbers[middle] < numbers[j]) {
                    j = middle;
                } else {
                    j--;
                }
            }

            return numbers[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 1, 2, 3, 4};
        System.out.println(new Solution().minArray(array));
    }
}


