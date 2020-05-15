package com.yang7;

import com.yang7.sword2offer.TreeNode;

public class 二叉树的最大深度 {
    int max = 0;

    class Solution {
        public int maxDepth(TreeNode root) {
            search(root, 0);
            return root == null ? 0 : max + 1;
        }

        private void search(TreeNode root, int i) {
            if (root == null) {
                return;
            }
            max = Math.max(max, i);
            search(root.left, i + 1);
            search(root.right, i + 1);
        }
    }
}
