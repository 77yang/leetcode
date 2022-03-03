  //给你一个二叉搜索树的根节点 root ，返回 树中任意两不同节点值之间的最小差值 。 
//
// 差值是一个正数，其数值等于两值之差的绝对值。 
//
// 
//
// 
// 
// 示例 1： 
//
// 
//输入：root = [4,2,6,1,3]
//输出：1
// 
//
// 示例 2： 
//
// 
//输入：root = [1,0,48,null,null,12,49]
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 树中节点的数目范围是 [2, 100] 
// 0 <= Node.val <= 10⁵ 
// 
//
// 
//
// 注意：本题与 530：https://leetcode-cn.com/problems/minimum-absolute-difference-in-
//bst/ 相同 
// 
// 
// Related Topics 树 深度优先搜索 广度优先搜索 二叉搜索树 二叉树 👍 212 👎 0

  
  package com.yang7.leetcode.editor.cn;

  import com.yang7.sword2offer.TreeNode;

  import java.util.ArrayList;
  import java.util.List;

  public class MinimumDistanceBetweenBstNodes{
      public static void main(String[] args) {
           Solution solution = new MinimumDistanceBetweenBstNodes().new Solution();
      }
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

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
      //leetcode submit region begin(Prohibit modification and deletion)

      class Solution {
          public int minDiffInBST(TreeNode root) {
              List<Integer> list = domain(root, new ArrayList());
              int ans = Integer.MAX_VALUE;
              for (int i = 1; i < list.size(); i++){
                  ans = Math.min(ans, list.get(i) - list.get(i-1));
              }
              return ans;
          }

          public List<Integer> domain(TreeNode node, List<Integer> list){
              if (node == null) return null;
              domain(node.left, list);
              list.add(node.val);
              domain(node.right, list);
              return list;
          }

      }


//leetcode submit region end(Prohibit modification and deletion)

  }