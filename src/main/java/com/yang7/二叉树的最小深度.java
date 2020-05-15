package com.yang7;

import com.yang7.sword2offer.TreeNode;

public class 二叉树的最小深度 {
    static class Solution {


        public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }

            if (root.left == null && root.right == null) {
                return 1;
            }

            int min = Integer.MAX_VALUE;


            if (root.left != null) {
                min = Math.min(minDepth(root.left), min);
            }

            if (root.right != null) {
                min = Math.min(minDepth(root.right), min);
            }
            return min + 1;
        }


        public static void main(String[] args) {
            TreeNode t1 = new TreeNode(1);
            TreeNode t2 = new TreeNode(2);
            t1.right = t2;
            System.out.println(new Solution().minDepth(t1));
        }
    }
}
