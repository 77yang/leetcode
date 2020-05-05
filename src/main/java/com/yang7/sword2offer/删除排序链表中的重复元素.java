package com.yang7.sword2offer;

public class 删除排序链表中的重复元素 {
   static class Solution {
        public ListNode deleteDuplicates(ListNode head) {

            ListNode last = null;
            ListNode first = head;
            while (head != null) {
                ListNode next = head.next;
                if (last != null && last.val == head.val) {
                    last.next = next;
                } else {
                    last = head;
                }
                head = next;

            }
            return first;
        }
    }
}
