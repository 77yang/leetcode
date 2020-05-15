package com.yang7;

import java.util.HashMap;
import java.util.Map;

/**
 * [4,1,8,4,5]
 * [5,0,1,8,4,5]
 * <p>
 * 快慢指针
 */
public class 两个链表的第一个公共节点 {

    static public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            Map<ListNode, Boolean> map = new HashMap<>();
            while (!(headA == null && headB == null)) {
                if (headA != null) {
                    if (map.getOrDefault(headA, false)) {
                        return headA;
                    }
                    map.put(headA, true);
                    headA = headA.next;
                }
                if (headB != null) {
                    if (map.getOrDefault(headB, false)) {
                        return headB;
                    }
                    map.put(headB, true);
                    headB = headB.next;
                }
            }
            return null;
        }


        public static void main(String[] args) {
            ListNode listNode1 = new ListNode(4);
            ListNode listNode2 = new ListNode(1);
            ListNode listNode3 = new ListNode(8);
            ListNode listNode4 = new ListNode(4);
            ListNode listNode5 = new ListNode(5);
            listNode1.next = listNode2;
            listNode2.next = listNode3;
            listNode3.next = listNode4;
            listNode4.next = listNode5;

            ListNode l1 = new ListNode(5);
            ListNode l2 = new ListNode(0);

            l1.next = l2;
            l2.next = listNode2;
            System.out.println(new Solution().getIntersectionNode(listNode1, l1));
        }
    }
}
