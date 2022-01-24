//给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。
//
// 叶子节点 是指没有子节点的节点。 
// 
//
// 示例 1： 
//
// 
//输入：root = [1,2,3,null,5]
//输出：["1->2->5","1->3"]
// 
//
// 示例 2： 
//
// 
//输入：root = [1]
//输出：["1"]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点的数目在范围 [1, 100] 内 
// -100 <= Node.val <= 100 
// 
// Related Topics 树 深度优先搜索 字符串 二叉树 👍 638 👎 0


package com.yang7.leetcode.editor.cn;

import com.yang7.sword2offer.TreeNode;
import com.yang7.sword2offer.TreeNodeUtil;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static void main(String[] args) {
        Solution solution = new BinaryTreePaths().new Solution();
        System.out.println(solution.binaryTreePaths(TreeNodeUtil.createTreeNode(new Integer[]{1, 2, 3, null, 5})));
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
        public List<String> binaryTreePaths(TreeNode root) {

            ArrayList<String> arrayList = new ArrayList<>();
            return findTrace(root, arrayList, String.valueOf(root.val));


        }

        private ArrayList<String> findTrace(TreeNode parent, ArrayList<String> arrayList, String traceStr) {
            TreeNode left = parent.left;
            TreeNode right = parent.right;
            if (left != null) {
                findTrace(left, arrayList, traceStr + "->" + left.val);
            }

            if (right != null) {
                findTrace(right, arrayList, traceStr + "->" + right.val);
            }

            if (left == null && right == null) {
                arrayList.add(traceStr);
            }
            return arrayList;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}