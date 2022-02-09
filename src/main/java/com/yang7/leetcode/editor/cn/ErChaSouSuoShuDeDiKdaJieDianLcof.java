  //给定一棵二叉搜索树，请找出其中第 k 大的节点的值。 
//
// 
//
// 示例 1: 
//
// 
//输入: root = [3,1,4,null,2], k = 1
//   3
//  / \
// 1   4
//  \
//   2
//输出: 4 
//
// 示例 2: 
//
// 
//输入: root = [5,3,6,2,4,null,null,1], k = 3
//       5
//      / \
//     3   6
//    / \
//   2   4
//  /
// 1
//输出: 4 
//
// 
//
// 限制： 
//
// 
// 1 ≤ k ≤ 二叉搜索树元素个数 
// 
// Related Topics 树 深度优先搜索 二叉搜索树 二叉树 👍 240 👎 0

  
  package com.yang7.leetcode.editor.cn;

  import com.yang7.sword2offer.TreeNode;
  import com.yang7.sword2offer.TreeNodeUtil;

  import java.util.PriorityQueue;

  public class ErChaSouSuoShuDeDiKdaJieDianLcof{
      public static void main(String[] args) {
           Solution solution = new ErChaSouSuoShuDeDiKdaJieDianLcof().new Solution();
          System.out.println(solution.kthLargest(TreeNodeUtil.createTreeNode(new Integer[]{2, 1}), 1));
          System.out.println(solution.kthLargest(TreeNodeUtil.createTreeNode(new Integer[]{5, 3, 6, 2, 4, null, null, 1}), 3));
      }
      //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int kthLargest(TreeNode root, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue();
        render(root,queue,k);
        return queue.peek();
    }

    private void render(TreeNode root, PriorityQueue<Integer> queue, int k) {
        if (root == null) {
            return;
        }


        if (queue.size() >= k) {
            if (queue.peek() < root.val) {
                queue.poll();
                queue.add(root.val);

            }
        } else {
            queue.add(root.val);

        }
        render(root.left, queue, k);
        render(root.right, queue, k);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }