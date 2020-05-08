package com.yang7.algorithms.sort;

import java.util.Arrays;

public class 冒泡排序 {

    public static int[] sort(int[] sourceArray) {
        int n = sourceArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sourceArray[j] > sourceArray[j + 1]) {
                    int temp = sourceArray[j];
                    sourceArray[j] = sourceArray[j + 1];
                    sourceArray[j + 1] = temp;
                }
            }
        }
        return sourceArray;
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
