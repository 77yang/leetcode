package com.yang7.sword2offer;

public class 机器人的运动范围 {

    static class Solution {
        int m, n, k, count;
        boolean[][] visited;

        public int movingCount(int m, int n, int k) {
            this.m = m;
            this.n = n;
            this.k = k;
            this.visited = new boolean[m][n];
            visit(0, 0);
            return count;
        }

        private void visit(int i, int j) {
            if (i < 0 || i >= m || j < 0 || j >= n) {
                return;
            }

            if (visited[i][j] || sum(i) + sum(j) > k) {
                return;
            }

            count++;
            visited[i][j] = true;
            visit(i + 1, j);
            visit(i - 1, j);
            visit(i, j + 1);
            visit(i, j - 1);
        }

        public static int sum(int x) {
            int sum = 0;
            while (x > 9) {
                sum += x % 10;
                x = x / 10;
            }
            sum += x;

            return sum;

        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().movingCount(2, 3, 1));
        System.out.println(new Solution().movingCount(3, 1, 0));

        System.out.println("==================");
        System.out.println(Solution.sum(30));
        System.out.println(Solution.sum(31));
        System.out.println(Solution.sum(0));
    }
}
