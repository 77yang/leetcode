package com.yang7.sword2offer;

import com.yang7.sword2offer.ListNode;

public class 反转链表 {

    static class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode left = null;
            while (head != null) {
                ListNode currentNode = head;
                ListNode right = head.next;
                if (left == null) {
                    left = currentNode;
                    left.next = null;
                } else {
                    currentNode.next = left;
                    left = currentNode;
                }
                if (right == null) {
                    break;
                }
                head = right;
            }
            return head;

        }

        public static void main(String[] args) {
            ListNode listNode1 = new ListNode(1);
            ListNode listNode2 = new ListNode(2);
            ListNode listNode3 = new ListNode(3);
            ListNode listNode4 = new ListNode(4);

            listNode1.next = listNode2;
            listNode2.next = listNode3;
            listNode3.next = listNode4;
            ListNode x = new Solution().reverseList(listNode1);
            System.out.println(x);
        }
    }
}
