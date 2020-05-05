package com.yang7.sword2offer;

public class 二叉树的镜像 {
    class Solution {
        public TreeNode mirrorTree(TreeNode root) {
            if (root == null) {
                return null;
            }
            TreeNode temp = root.left;
            root.left = mirrorTree(root.right);
            root.right = mirrorTree(temp);
            return root;
        }


    }
}
