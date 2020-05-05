package com.yang7.sword2offer;

public class 合并两个排序的链表 {

    static public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;


        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(2);
        l3.next = l4;

        ListNode mergeTwoLists = mergeTwoLists(l1, l3);
        System.out.println(mergeTwoLists);
    }
}
