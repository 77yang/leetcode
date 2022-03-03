//对一个大小为 n x n 的矩阵而言，如果其每一行和每一列都包含从 1 到 n 的 全部 整数（含 1 和 n），则认为该矩阵是一个 有效 矩阵。
//
// 给你一个大小为 n x n 的整数矩阵 matrix ，请你判断矩阵是否为一个有效矩阵：如果是，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：matrix = [[1,2,3],[3,1,2],[2,3,1]]
//输出：true
//解释：在此例中，n = 3 ，每一行和每一列都包含数字 1、2、3 。
//因此，返回 true 。
// 
//
// 示例 2： 
//
// 
//
// 
//输入：matrix = [[1,1,1],[1,2,3],[1,2,3]]
//输出：false
//解释：在此例中，n = 3 ，但第一行和第一列不包含数字 2 和 3 。
//因此，返回 false 。
// 
//
// 
//
// 提示： 
//
// 
// n == matrix.length == matrix[i].length 
// 1 <= n <= 100 
// 1 <= matrix[i][j] <= n 
// 
// Related Topics 数组 哈希表 矩阵 👍 6 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

public class CheckIfEveryRowAndColumnContainsAllNumbers {
    public static void main(String[] args) {
        Solution solution = new CheckIfEveryRowAndColumnContainsAllNumbers().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean checkValid(int[][] matrix) {
        /*
        - 明确题意为查重；
        - 且提示中：1 <= matrix[i][j] <= n 因此只要关注查重
            - -->查重首先应该想到 Set 数据结构的 不可重复性
        */
            int n = matrix.length;
            for (int i = 0; i < n; i++) {
                Set<Integer> rowset = new HashSet<>();
                Set<Integer> colset = new HashSet<>();
                for (int j = 0; j < n; j++) {
                    // 先检查行
                    if (rowset.contains(matrix[i][j])) return false;
                    else rowset.add(matrix[i][j]);
                    // 再检查列
                    if (colset.contains(matrix[j][i])) return false;
                    else colset.add(matrix[j][i]);
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}