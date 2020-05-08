package com.yang7;

public class 反转链表 {
    static class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode last = null;
            while (head != null) {
                if (last == null) {
                    last = head;
                    head = head.next;
                    last.next = null;
                } else {
                    ListNode next = head.next;
                    if (last != null) {
                        head.next = last;
                        last = head;
                    }

                    if (next == null) {
                        return head;
                    }
                    head = next;
                }

            }
            return last;
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
            ListNode x = new Solution().reverseList(l1);
            System.out.println(x);
        }
    }
}
