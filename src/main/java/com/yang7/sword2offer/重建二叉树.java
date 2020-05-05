package com.yang7.sword2offer;

/**
 * https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class 重建二叉树 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int i = 0;

        while (i < preorder.length) {
            int root = preorder[i];
            TreeNode treeNode = new TreeNode(root);
            for (int j = 0; j < inorder.length; j++) {
                if (preorder[i] == inorder[j]) {
                    TreeNode left = new TreeNode(root);
                    TreeNode right = new TreeNode(root);
                    treeNode.left = left;
                    treeNode.right = right;
                }
            }

        }


            return null;

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
