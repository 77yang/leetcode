//给你二叉搜索树的根节点 root ，该树中的 恰好 两个节点的值被错误地交换。请在不改变其结构的情况下，恢复这棵树 。
//
// 
//
// 示例 1： 
//
// 
//输入：root = [1,3,null,null,2]
//输出：[3,1,null,null,2]
//解释：3 不能是 1 的左孩子，因为 3 > 1 。交换 1 和 3 使二叉搜索树有效。
// 
//
// 示例 2： 
//
// 
//输入：root = [3,1,4,null,null,2]
//输出：[2,1,4,null,null,3]
//解释：2 不能在 3 的右子树中，因为 2 < 3 。交换 2 和 3 使二叉搜索树有效。 
//
// 
//
// 提示： 
//
// 
// 树上节点的数目在范围 [2, 1000] 内 
// -2³¹ <= Node.val <= 2³¹ - 1 
// 
//
// 
//
// 进阶：使用 O(n) 空间复杂度的解法很容易实现。你能想出一个只使用 O(1) 空间的解决方案吗？ 
// Related Topics 树 深度优先搜索 二叉搜索树 二叉树 👍 655 👎 0


package com.yang7.leetcode.editor.cn;

import com.yang7.sword2offer.TreeNode;
import com.yang7.sword2offer.TreeNodeUtil;

import java.util.HashMap;
import java.util.Map;

public class RecoverBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new RecoverBinarySearchTree().new Solution();
        //todo just swap treeNode value but not change reference
        solution.recoverTree(TreeNodeUtil.createTreeNode(new Integer[]{1, 3, null, null, 2}));
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

        Map<TreeNode, Integer> map = new HashMap<>();

        public void recoverTree(TreeNode root) {


            findWrongNode(root);
            if (map.size() > 1) {

            } else {

                for (TreeNode node : map.keySet()) {
                    Integer v = map.get(node);
                    if (v > 0) {
                        swap(node, node.right);
                    } else {
                        swap(node, node.left);
                    }
                }
            }

            System.out.println(root);

        }

        private void swap(TreeNode node, TreeNode right) {
            Integer temp = node.val;
            node.val = right.val;
            right.val = temp;
        }

        private void findWrongNode(TreeNode root) {
            if (root == null) {
                return;
            }

            TreeNode left = root.left;
            TreeNode right = root.right;

            if (left != null) {

                if (left.val >= root.val) {
                    map.put(root, -1);
                }
                findWrongNode(left);
            }

            if (right != null) {

                if (right.val <= root.val) {
                    map.put(root, 1);
                }
                findWrongNode(right);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}