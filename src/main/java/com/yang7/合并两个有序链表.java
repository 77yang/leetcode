package com.yang7;

public class 合并两个有序链表 {
   static class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode first = new ListNode(0);
            ListNode cur = first;
            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    cur.next = l1;
                    l1 = l1.next;
                } else {
                    cur.next = l2;
                    l2 = l2.next;
                }
                cur = cur.next;
            }
            cur.next = l1 != null ? l1 : l2;
            return first.next;
        }
    }
}
