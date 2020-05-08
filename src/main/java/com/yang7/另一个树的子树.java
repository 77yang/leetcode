package com.yang7;

import com.yang7.sword2offer.TreeNode;

public class 另一个树的子树 {
    static class Solution {
        public boolean isSubtree(TreeNode s, TreeNode t) {
            if (t == null) {
                return true;
            }

            if (s == null) {
                return false;
            }


            return isSameTree(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
        }

        private boolean isSameTree(TreeNode s, TreeNode t) {
            if (s == null && t == null) {
                return true;
            }
            if (s == null || t == null) {
                return false;
            }
            if (s.val != t.val) return false;
            return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
        }
    }
}
