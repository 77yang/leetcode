//给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非递增顺序排列。
//
// 请你统计并返回 grid 中 负数 的数目。 
//
// 
//
// 示例 1： 
//
// 
//输入：grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
//输出：8
//解释：矩阵中共有 8 个负数。
// 
//
// 示例 2： 
//
// 
//输入：grid = [[3,2],[1,0]]
//输出：0
// 
//
// 示例 3： 
//
// 
//输入：grid = [[1,-1],[-1,-1]]
//输出：3
// 
//
// 示例 4： 
//
// 
//输入：grid = [[-1]]
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 100 
// -100 <= grid[i][j] <= 100 
// 
//
// 
//
// 进阶：你可以设计一个时间复杂度为 O(n + m) 的解决方案吗？ 
//
// 
// Related Topics 数组 二分查找 矩阵 👍 87 👎 0


package com.yang7.leetcode.editor.cn;

public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        Solution solution = new CountNegativeNumbersInASortedMatrix().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        // 二分查找某个数
        public int binarySearch(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) { // 注意
                int mid = left + ((right - left) >> 1);
                if (nums[mid] == target)
                    return mid;
                    // 收缩右边界
                else if (nums[mid] > target)
                    right = mid - 1;
                    // 收缩左边界
                else // (nums[mid] < target)
                    left = mid + 1;
            }
            return -1;
        }

        public int countNegatives1(int[][] grid) {


            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] < 0) {
                        count++;
                    }

                }
            }

            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}