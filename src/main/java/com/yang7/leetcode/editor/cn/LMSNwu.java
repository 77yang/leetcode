  ////给定两个 非空链表 l1和 l2 来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。 
////
//// 可以假设除了数字 0 之外，这两个数字都不会以零开头。 
////
//// 
////
//// 示例1： 
////
//// 
////
//// 
////输入：l1 = [7,2,4,3], l2 = [5,6,4]
////输出：[7,8,0,7]
//// 
////
//// 示例2： 
////
//// 
////输入：l1 = [2,4,3], l2 = [5,6,4]
////输出：[8,0,7]
//// 
////
//// 示例3： 
////
//// 
////输入：l1 = [0], l2 = [0]
////输出：[0]
//// 
////
//// 
////
//// 提示： 
////
//// 
//// 链表的长度范围为 [1, 100] 
//// 0 <= node.val <= 9 
//// 输入数据保证链表代表的数字无前导 0 
//// 
////
//// 
////
//// 进阶：如果输入链表不能修改该如何处理？换句话说，不能对列表中的节点进行翻转。 
////
//// 
////
//// 注意：本题与主站 445 题相同：https://leetcode-cn.com/problems/add-two-numbers-ii/ 
//// Related Topics 栈 链表 数学 👍 33 👎 0
//

  
  package com.yang7.leetcode.editor.cn;

  import com.yang7.sword2offer.ListNode;

  import java.util.Stack;

  public class LMSNwu{
      public static void main(String[] args) {
           Solution solution = new LMSNwu().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

      /**
       * Definition for singly-linked list.
       * public class ListNode {
       * int val;
       * ListNode next;
       * ListNode() {}
       * ListNode(int val) { this.val = val; }
       * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
       * }
       */
      class Solution {
          public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
              Stack<Integer> stack1 = new Stack<>();
              Stack<Integer> stack2 = new Stack<>();
              while (l1 != null) {
                  stack1.push(l1.val);
                  l1 = l1.next;
              }
              while (l2 != null) {
                  stack2.push(l2.val);
                  l2 = l2.next;
              }

              int carry = 0;
              ListNode head = null;
              while (!stack1.isEmpty() || !stack2.isEmpty() || carry > 0) {
                  int sum = carry;
                  sum += stack1.isEmpty() ? 0 : stack1.pop();
                  sum += stack2.isEmpty() ? 0 : stack2.pop();
                  ListNode node = new ListNode(sum % 10);
                  node.next = head;
                  head = node;
                  carry = sum / 10;
              }
              return head;
          }
      }


//leetcode submit region end(Prohibit modification and deletion)

  }