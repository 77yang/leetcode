//给定一个非空二叉树的根节点 root , 以数组的形式返回每一层节点的平均值。与实际答案相差 10⁻⁵ 以内的答案可以被接受。
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：[3.00000,14.50000,11.00000]
//解释：第 0 层的平均值为 3,第 1 层的平均值为 14.5,第 2 层的平均值为 11 。
//因此返回 [3, 14.5, 11] 。
// 
//
// 示例 2: 
//
// 
//
// 
//输入：root = [3,9,20,15,7]
//输出：[3.00000,14.50000,11.00000]
// 
//
// 
//
// 提示： 
//
// 
//
// 
// 树中节点数量在 [1, 10⁴] 范围内 
// -2³¹ <= Node.val <= 2³¹ - 1 
// 
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 312 👎 0


package com.yang7.leetcode.editor.cn;

import com.yang7.sword2offer.TreeNode;
import com.yang7.sword2offer.TreeNodeUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageOfLevelsInBinaryTree {
    public static void main(String[] args) {
        Solution solution = new AverageOfLevelsInBinaryTree().new Solution();
        System.out.println(solution.averageOfLevels(TreeNodeUtil.createTreeNode(new Integer[]{2147483647,2147483647,2147483647})));
        System.out.println(solution.averageOfLevels(TreeNodeUtil.createTreeNode(new Integer[]{3, 9, 20, null, null, 15, 7})));
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
        Map<Integer, List<Long>> map = new HashMap<>();

        public List<Double> averageOfLevels(TreeNode root) {


            sum(0, root);


            ArrayList result = new ArrayList();
            for (Map.Entry<Integer, List<Long>> entry : map.entrySet()) {
                List<Long> list = entry.getValue();
                long sum = 0;
                for (Long v : list) {
                    sum += v;

                }
                result.add(sum * 1.00000/ list.size());
            }

            return result;
        }

        private void sum(int i, TreeNode root) {
            if (root == null) {
                return;
            }
            List<Long> ls = map.getOrDefault(i, new ArrayList());
            ls.add((long)root.val);
            map.put(i, ls);
            sum(i + 1, root.left);
            sum(i + 1, root.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}