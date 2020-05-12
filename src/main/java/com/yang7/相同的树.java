package com.yang7;

import com.yang7.sword2offer.TreeNode;

public class 相同的树 {
    static class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;
            }
            if (p == null || q == null) {
                return false;
            }
            return p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
    }
}
