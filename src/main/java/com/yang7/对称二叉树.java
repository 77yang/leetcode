package com.yang7;

import com.yang7.sword2offer.TreeNode;

public class 对称二叉树 {
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            return  isSameTree(root.left,root.right);
        }

        private boolean isSameTree(TreeNode leftTree, TreeNode rightTree) {

            if (leftTree == null || rightTree == null) {
                return leftTree == rightTree;
            }

            return leftTree.val==rightTree.val && isSameTree(leftTree.left,rightTree.right) && isSameTree(leftTree.right,rightTree.left);
        }
    }
}
