//给你一棵二叉搜索树，请 按中序遍历 将其重新排列为一棵递增顺序搜索树，使树中最左边的节点成为树的根节点，并且每个节点没有左子节点，只有一个右子节点。
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
//输出：[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
// 
//
// 示例 2： 
//
// 
//
// 
//输入：root = [5,1,7]
//输出：[1,null,5,null,7]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数的取值范围是 [1, 100] 
// 0 <= Node.val <= 1000 
// 
//
// 
//
// 注意：本题与主站 897 题相同： https://leetcode-cn.com/problems/increasing-order-search-
//tree/ 
// Related Topics 栈 树 深度优先搜索 二叉搜索树 二叉树 👍 15 👎 0


package com.yang7.leetcode.editor.cn;

import com.yang7.sword2offer.TreeNode;
import com.yang7.sword2offer.TreeNodeUtil;

import java.util.ArrayList;

public class NYBBNL {
    public static void main(String[] args) {
        Solution solution = new NYBBNL().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public TreeNode increasingBST(TreeNode root) {
            //左中右

            ArrayList<Integer> ls = new ArrayList<>();
            render(root, ls);
            TreeNode pre = null;
            TreeNode head = null;
            for (Integer v : ls) {
                TreeNode cur = new TreeNode(v);
                if (pre != null) {
                    pre.right = cur;
                } else {
                    head = cur;
                }
                pre = cur;
            }

            return head;
        }

        private void render(TreeNode root, ArrayList<Integer> ls) {
            if (root == null) {
                return;
            }
            render(root.left, ls);
            ls.add(root.val);
            render(root.right, ls);
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}