package com.yang7.algorithms.sort;

import java.util.Arrays;

public class 选择排序 {

    public static int[] sort(int[] sourceArray) {
        int n = sourceArray.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (sourceArray[min_idx] > sourceArray[j]) {
                    min_idx = j;
                }
            }
            int temp = sourceArray[min_idx];
            sourceArray[min_idx] = sourceArray[i];
            sourceArray[i] = temp;

        }
        return sourceArray;
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
