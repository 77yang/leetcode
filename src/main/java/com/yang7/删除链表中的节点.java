package com.yang7;

public class 删除链表中的节点 {
    static class Solution {
        public void deleteNode(ListNode node) {

            node.val = node.next.val;
            node.next = node.next.next;



        }
    }

}
