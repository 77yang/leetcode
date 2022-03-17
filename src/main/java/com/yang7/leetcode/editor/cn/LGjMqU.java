  //给定一个单链表 L 的头节点 head ，单链表 L 表示为： 
//
// L0 → L1 → … → Ln-1 → Ln 
//请将其重新排列后变为： 
//
// L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → … 
//
// 不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。 
//
// 
//
// 示例 1: 
//
// 
//
// 
//输入: head = [1,2,3,4]
//输出: [1,4,2,3] 
//
// 示例 2: 
//
// 
//
// 
//输入: head = [1,2,3,4,5]
//输出: [1,5,2,4,3] 
//
// 
//
// 提示： 
//
// 
// 链表的长度范围为 [1, 5 * 10⁴] 
// 1 <= node.val <= 1000 
// 
//
// 
//
// 注意：本题与主站 143 题相同：https://leetcode-cn.com/problems/reorder-list/ 
// Related Topics 栈 递归 链表 双指针 👍 42 👎 0

  
  package com.yang7.leetcode.editor.cn;

  import com.yang7.sword2offer.ListNode;

  import java.util.Stack;

  public class LGjMqU{
      public static void main(String[] args) {
           Solution solution = new LGjMqU().new Solution();
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
          public void reorderList(ListNode head) {
              //借助栈实现
              Stack<ListNode> stack = new Stack<>();
              ListNode cur = head;
              while (cur != null) { //节点入栈
                  stack.push(cur);
                  cur = cur.next;
              }
              //链表重排
              cur = head;
              while (!stack.isEmpty()) {
                  ListNode pop = stack.pop();
                  if (cur == pop) { //循环退出条件
                      break;
                  }
                  if (cur.next == pop) {
                      cur = cur.next;
                      break;
                  }
                  //尾节点插入到当前节点与下一个节点中间
                  pop.next = cur.next;
                  cur.next = pop;
                  //移动前序遍历当前节点指针
                  cur = cur.next.next;
              }
              cur.next = null;  //断除尾节点后的无效节点
          }
      }

//leetcode submit region end(Prohibit modification and deletion)

  }