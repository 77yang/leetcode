package com.yang7;

import com.yang7.sword2offer.TreeNode;

public class 验证二叉搜索树 {
    class Solution {
        public boolean isValidBST(TreeNode root) {
            return check(root, null, null);
        }

        private boolean check(TreeNode node, Integer low,Integer high) {
            if (node==null) {
                return true;
            }
            int val = node.val;
            if (low != null && val <= low) {
                return false;
            }

            if (high != null && val >= high) {
                return false;
            }


            return check(node.left, low, val) && check(node.right, val, high);

        }
    }
}
