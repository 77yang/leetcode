package com.yang7.algorithms.sort;

import java.util.Arrays;

public class 插入排序 {

    public static int[] sort(int[] sourceArray) {
        for (int i = 1; i < sourceArray.length; i++) {
            int key = sourceArray[i];
            int j = i - 1;
            while (j >= 0 && key < sourceArray[j]) {
                sourceArray[j + 1] = sourceArray[j];
                j--;
            }
            sourceArray[j+1] = key;
        }
        return sourceArray;
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
