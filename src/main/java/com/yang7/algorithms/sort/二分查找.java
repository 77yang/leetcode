package com.yang7.algorithms.sort;

public class 二分查找 {

    public static int find(int low, int high, int[] arr, int obj) {
        while (low <= high) {
            int middle = (low + high) / 2;
            if (arr[middle] == obj) {
                return middle;
            }
            if (arr[middle] > obj) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 10};
        System.out.println(find(0, arr.length - 1, arr, 2));
        System.out.println(find(0, arr.length - 1, arr, 5));
        System.out.println(find(0, arr.length - 1, arr, 10));
        System.out.println(find(0, arr.length - 1, arr, 3));
        System.out.println(find(0, arr.length - 1, arr, 11));
    }
}
