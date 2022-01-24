//计算给定二叉树的所有左叶子之和。
//
// 示例： 
//
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
//在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24 
//
// 
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 385 👎 0


package com.yang7.leetcode.editor.cn;

import com.yang7.sword2offer.TreeNode;
import com.yang7.sword2offer.TreeNodeUtil;

public class SumOfLeftLeaves {
    public static void main(String[] args) {
        Solution solution = new SumOfLeftLeaves().new Solution();
        System.out.println(solution.sumOfLeftLeaves(TreeNodeUtil.createTreeNode(new Integer[]{3, 9, 20, null, null, 15, 7})));//Expected:24
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
    class Solution {
        public int sumOfLeftLeaves(TreeNode root) {

            //满足条件   叶子集结点+左节点

            return sum(null, root);


        }

        private int sum(TreeNode pParent, TreeNode parent) {

            int sum = 0;
            if (parent == null) {
                return 0;
            }


            TreeNode left = parent.left;
            if (left != null) {
                sum += sum(parent, left);
            }

            TreeNode right = parent.right;
            if (right != null) {
                sum += sum(parent, right);
            }

            if (left == null && right == null && pParent != null && pParent.left == parent) {
                sum += parent.val;
            }

            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}