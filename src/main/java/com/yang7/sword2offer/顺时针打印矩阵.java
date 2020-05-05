package com.yang7.sword2offer;

import java.util.Arrays;

public class 顺时针打印矩阵 {
    static class Solution {
        public int[] spiralOrder(int[][] matrix) {
            int rows = matrix.length;
            if (rows < 1) {
                return new int[]{};
            }
            int columns = matrix[0].length;
            boolean[][] remember = new boolean[rows][columns];
            int[] arr = new int[rows*columns];
            int count = 0;
            String orient = "right";
            int i = 0, j = 0;
            while (true) {
                if (count == rows * columns) {
                    break;

                }
                switch (orient) {
                    case "right":
                        if (j < columns && !remember[i][j]) {
                            arr[count++] = matrix[i][j];
                            remember[i][j] = true;
                            j++;
                        } else {
                            orient = "down";
                            j--;
                            i++;
                        }
                        break;
                    case "down":
                        if (i < rows && !remember[i][j]) {
                            arr[count++] = matrix[i][j];
                            remember[i][j] = true;
                            i++;
                        } else {
                            orient = "left";
                            i--;
                            j--;
                        }
                        break;

                    case "left":
                        if (j >= 0 && !remember[i][j]) {
                            arr[count++] = matrix[i][j];
                            remember[i][j] = true;
                            j--;
                        } else {
                            orient = "up";
                            j++;
                            i--;
                        }
                        break;
                    case "up":
                        if (i >= 0 && !remember[i][j]) {
                            arr[count++] = matrix[i][j];
                            remember[i][j] = true;
                            i--;
                        } else {
                            orient = "right";
                            i++;
                            j++;
                        }
                        break;
                }

            }
            return arr;
        }

        public static void main(String[] args) {
            int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int[] order = new Solution().spiralOrder(matrix);
            System.out.println(Arrays.toString(order));

        }
    }
}
