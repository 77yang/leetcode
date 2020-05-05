package com.yang7.sword2offer;

/*
https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&tqId=11154&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking

考察点：二分查找，  从右上角看就是一个排序二叉树

1234
5678
91011

1234
5678
91011

 */
public class 二维数组中的查找 {
    public boolean Find(int target, int[][] matrix) {
        if (matrix == null || matrix.length < 1) {
            return false;
        }
        int i = 0;
        int j = matrix[0].length - 1;
        int rows = matrix.length - 1;
        while (j >= 0 && i <= rows) {
            if (matrix[i][j] == target) {
                System.out.println(i + "," + j);
                return true;
            }

            if (matrix[i][j] > target) {
                j--;
            }
            if (matrix[i][j] < target) {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println(new 二维数组中的查找().Find(10, matrix));
        System.out.println(new 二维数组中的查找().Find(1, matrix));
        System.out.println(new 二维数组中的查找().Find(2, matrix));

        matrix = new int[][]{{1, 2}};
        System.out.println(new 二维数组中的查找().Find(10, matrix));
        System.out.println(new 二维数组中的查找().Find(1, matrix));
        System.out.println(new 二维数组中的查找().Find(2, matrix));
    }
}
