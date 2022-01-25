//给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
//
// 例如， 
//
// 
//给定二叉搜索树:
//
//        4
//       / \
//      2   7
//     / \
//    1   3
//
//和值: 2
// 
//
// 你应该返回如下子树: 
//
// 
//      2     
//     / \   
//    1   3
// 
//
// 在上述示例中，如果要找的值是 5，但因为没有节点值为 5，我们应该返回 NULL。 
// Related Topics 树 二叉搜索树 二叉树 👍 233 👎 0


package com.yang7.leetcode.editor.cn;

import com.yang7.sword2offer.TreeNode;
import com.yang7.sword2offer.TreeNodeUtil;

public class SearchInABinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new SearchInABinarySearchTree().new Solution();
        System.out.println(solution.searchBST(TreeNodeUtil.createTreeNode(new Integer[]{4, 2, 7, 1, 3}), 2));
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
        public TreeNode searchBST(TreeNode root, int val) {

            boolean flag = root != null;
            if (flag && val == root.val) {
                return root;
            }
            if (flag) {
                TreeNode treeNode = searchBST(root.left, val);
                return treeNode == null ? searchBST(root.right, val) : treeNode;
            }
            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}