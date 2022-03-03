  //你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。 
//
// 空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。 
//
// 示例 1: 
//
// 
//输入: 二叉树: [1,2,3,4]
//       1
//     /   \
//    2     3
//   /    
//  4     
//
//输出: "1(2(4))(3)"
//
//解释: 原本将是“1(2(4)())(3())”，
//在你省略所有不必要的空括号对之后，
//它将是“1(2(4))(3)”。
// 
//
// 示例 2: 
//
// 
//输入: 二叉树: [1,2,3,null,4]
//       1
//     /   \
//    2     3
//     \  
//      4 
//
//输出: "1(2()(4))(3)"
//
//解释: 和第一个示例相似，
//除了我们不能省略第一个对括号来中断输入和输出之间的一对一映射关系。
// 
// Related Topics 树 深度优先搜索 字符串 二叉树 👍 241 👎 0

  
  package com.yang7.leetcode.editor.cn;

  import com.yang7.sword2offer.TreeNode;
  import com.yang7.sword2offer.TreeNodeUtil;

  public class ConstructStringFromBinaryTree{
      public static void main(String[] args) {
           Solution solution = new ConstructStringFromBinaryTree().new Solution();
//          System.out.println(solution.tree2str(TreeNodeUtil.createTreeNode(new Integer[]{1, 2, 3, 4})));
          //				Expected:"1(2()(4))(3)"
          System.out.println(solution.tree2str(TreeNodeUtil.createTreeNode(new Integer[]{1, 2, 3,null, 4})));
      }

      //leetcode submit region begin(Prohibit modification and deletion)
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
class Solution {
    public String tree2str(TreeNode root) {
        if (root == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        //因为要递归调用，不能每次递归都新建一个sb，所以我选择另写一个方法
        treeToString(root,sb);
        return sb.toString();
    }

    public void treeToString(TreeNode t,StringBuilder sb){
        if (t == null){
            return;
        }
        //1、先将t的val值拼接进来
        sb.append(t.val);
        //2、判断左子树是否为空（是则，否则拼接'('）
        if (t.left != null){
            sb.append('(');
            treeToString(t.left,sb);
            //此时，若右树为空，要拼接')'时，我选择在此后的判断中直接return回来，此时程序继续向下走到此行，即可拼接
            sb.append(')');
        }else {
            if (t.right == null){
                return;
            }else {
                //左子树为空，但有右子树，由题意拼接"()"
                sb.append("()");
            }
        }
        if (t.right == null){
            return;
        }else {
            sb.append('(');
            treeToString(t.right,sb);
            sb.append(')');
        }
    }
}

//leetcode submit region end(Prohibit modification and deletion)

  }