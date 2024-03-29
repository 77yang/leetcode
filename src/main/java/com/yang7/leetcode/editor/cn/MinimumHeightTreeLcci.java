//给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉搜索树。示例: 给定有序数组: [-10,-3,0,5,9], 一个可能
//的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：           0          / \        -3 
//  9        /   /      -10  5 Related Topics 树 二叉搜索树 数组 分治 二叉树 👍 112 👎 0


package com.yang7.leetcode.editor.cn;

import com.yang7.sword2offer.TreeNode;

import java.util.Arrays;

public class MinimumHeightTreeLcci {
    public static void main(String[] args) {
        Solution solution = new MinimumHeightTreeLcci().new Solution();
        System.out.println(solution.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9}));
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            if (nums == null || nums.length == 0) return null;
            int rootIndex = nums.length / 2;
            TreeNode root = new TreeNode(nums[rootIndex]);
            root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, rootIndex));
            root.right = sortedArrayToBST(Arrays.copyOfRange(nums, rootIndex + 1, nums.length));
            return root;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}