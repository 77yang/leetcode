package com.yang7.sword2offer;

public class 链表中倒数第k个节点 {



   static class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            int i = k;
            ListNode first = head;
            ListNode second = head;
            while (i > 0 && first != null) {
                first = first.next;
                i--;
            }
            while (first != null) {
                first = first.next;
                second = second.next;
            }
            return second;
        }

       public static void main(String[] args) {

           ListNode listNode1 = new ListNode(1);
           ListNode listNode2 = new ListNode(2);
           ListNode listNode3 = new ListNode(3);


           listNode1.next = listNode2;
           listNode2.next = listNode3;

           ListNode kthFromEnd = new Solution().getKthFromEnd(listNode1, 1);
           System.out.println(kthFromEnd.val);


       }
    }


}
