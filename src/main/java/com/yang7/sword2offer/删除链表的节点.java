package com.yang7.sword2offer;

public class 删除链表的节点 {

    static public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    static class Solution {
        public ListNode deleteNode(ListNode head, int val) {

            if (head == null) {
                return null;
            }

            ListNode lastNode = null;
            ListNode firstNode = head;

            while (head != null) {
                ListNode nextNode = head.next;
                if (head.val == val) {
                    if (lastNode == null) {
                        firstNode = nextNode;
                    } else {
                        lastNode.next = nextNode;
                    }
                } else {
                    lastNode = head;
                }
                head = nextNode;
            }
            return firstNode;
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        ListNode x = new Solution().deleteNode(listNode1, 1);
        System.out.println(x);
    }

}
