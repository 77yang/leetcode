package com.yang7.utils;

import com.yang7.sword2offer.ListNode;

public class ListNodeUtil {

    public static ListNode convert(int[] nums) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int num : nums) {
            ListNode listNode = new ListNode(num);
            cur.next = listNode;
            cur = listNode;
        }

        return head.next;

    }

    public static void main(String[] args) {
        System.out.println(convert(new int[]{1, 2, 3, 4, 5, 6}));
    }
}
