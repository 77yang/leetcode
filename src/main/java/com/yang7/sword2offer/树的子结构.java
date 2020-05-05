package com.yang7.sword2offer;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class 树的子结构 {

    static class Solution {
        public boolean isSubStructure(TreeNode A, TreeNode B) {
            return (A != null && B != null) && same(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
        }


        boolean same(TreeNode A, TreeNode B) {
            if (B == null) {
                return true;
            }

            if (A == null || A.val != B.val) {
                return false;
            }

            return same(A.left, B.left) && same(A.right, B.right);

        }
    }
}
