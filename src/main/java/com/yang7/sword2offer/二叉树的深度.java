package com.yang7.sword2offer;

public class 二叉树的深度 {
    class Solution {
        public int maxDepth(TreeNode root) {


            if (root == null) {

                return 0;
            }

            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

        }
    }
}
