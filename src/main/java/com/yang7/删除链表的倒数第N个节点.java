package com.yang7;

import java.util.List;
import java.util.Stack;

public class 删除链表的倒数第N个节点 {
  static   class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode fast = head;
            ListNode slow = head;
            while (n-- > 0) {
                fast = fast.next;
            }
            if(fast == null){
                if(slow.next == null){
                    return null;
                }else{
                    return slow.next;

                }

            }
            while (fast != null) {
                fast = fast.next;
                if (fast==null) {
                    break;
                }
                slow = slow.next;
            }
            if (slow != null && slow.next!=null) {
                slow.next = slow.next.next;
            }
            return head;
        }

      public static void main(String[] args) {
          ListNode l1 = new ListNode(1);
          ListNode l2 = new ListNode(2);
          ListNode l3 = new ListNode(3);
          ListNode l4 = new ListNode(4);
          ListNode l5 = new ListNode(5);
          l1.next = l2;
          l2.next = l3;
          l3.next = l4;
          l4.next = l5;
          ListNode listNode = new Solution().removeNthFromEnd(l1, 2);


           l1 = new ListNode(1);

           listNode = new Solution().removeNthFromEnd(l1, 1);
          System.out.println(listNode);
      }
    }
}
