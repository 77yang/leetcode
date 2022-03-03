//给出一棵二叉树，其上每个结点的值都是 0 或 1 。每一条从根到叶的路径都代表一个从最高有效位开始的二进制数。例如，如果路径为 0 -> 1 -> 1 ->
// 0 -> 1，那么它表示二进制数 01101，也就是 13 。 
//
// 对树上的每一片叶子，我们都要找出从根到该叶子的路径所表示的数字。 
//
// 返回这些数字之和。题目数据保证答案是一个 32 位 整数。 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [1,0,1,0,1,0,1]
//输出：22
//解释：(100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
// 
//
// 示例 2： 
//
// 
//输入：root = [0]
//输出：0
// 
//
// 示例 3： 
//
// 
//输入：root = [1]
//输出：1
// 
//
// 示例 4： 
//
// 
//输入：root = [1,1]
//输出：3
// 
//
// 
//
// 提示： 
//
// 
// 树中的结点数介于 1 和 1000 之间。 
// Node.val 为 0 或 1 。 
// 
// Related Topics 树 深度优先搜索 二叉树 👍 138 👎 0


package com.yang7.leetcode.editor.cn;

import com.yang7.sword2offer.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SumOfRootToLeafBinaryNumbers {
    public static void main(String[] args) {
        Solution solution = new SumOfRootToLeafBinaryNumbers().new Solution();

    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        int ans;

        public int sumRootToLeaf(TreeNode root) {
            ans = 0;
            dfs(root, 0);
            return ans;
        }

        public void dfs(TreeNode root, int prev) {
            // 若根节点为空直接返回
            if (root == null)
                return;

            // 二进制求和法

            /**
             * 0*2+1=1
             * 1*2+1=3
             * 3*2+0=6
             *
             * 2^2+2^1+0=6
             */
            prev = prev * 2 + root.val;

            // 若该节点没有左右子树，则得到一条路径的和
            if (root.left == null && root.right == null) {
                ans += prev;
                return;
            }

            // 遍历左右子树节点
            dfs(root.left, prev);
            dfs(root.right, prev);
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}