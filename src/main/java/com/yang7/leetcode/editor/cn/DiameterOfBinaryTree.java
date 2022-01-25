//给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
//
// 
//
// 示例 : 
//给定二叉树 
//
//           1
//         / \
//        2   3
//       / \     
//      4   5    
// 
//
// 返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。 
//
// 
//
// 注意：两结点之间的路径长度是以它们之间边的数目表示。 
// Related Topics 树 深度优先搜索 二叉树 👍 890 👎 0


package com.yang7.leetcode.editor.cn;

import com.yang7.sword2offer.TreeNode;
import com.yang7.sword2offer.TreeNodeUtil;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.diameterOfBinaryTree(TreeNodeUtil.createTreeNode(new Integer[]{1, 2, 3, 4, 5})));
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
    static class Solution {
        public static int max;

        public int diameterOfBinaryTree(TreeNode root) {
            max = 0;
            compute(root);
            return max - 1;
        }

        private static int compute(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int a = compute(root.left);
            int b = compute(root.right);
            max = Math.max(a + b + 1, max);
            return Math.max(a, b) + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}