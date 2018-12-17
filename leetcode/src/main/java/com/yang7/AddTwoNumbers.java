package com.yang7;

/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * <p>
 * <p>
 * https://leetcode.com/problems/add-two-numbers/
 *
 * @Author: yangqi
 * @Date: 12/7/2018 6:00 PM
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode headNode = null,
                newNode = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            carry = sum / 10;
            int remainder = sum % 10;
            ListNode node = new ListNode(remainder);
            if (headNode == null) {
                headNode = node;
            } else {
                newNode.next = node;
            }
            newNode = node;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            newNode.next = new ListNode(carry);
        }
        return headNode;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
/*        l1.next = new com.yang7.ListNode(4);
        l1.next.next = new com.yang7.ListNode(3);*/


        ListNode l2 = new ListNode(5);
  /*      l2.next = new com.yang7.ListNode(6);
        l2.next.next = new com.yang7.ListNode(4);*/


        ListNode listNode = new AddTwoNumbers().addTwoNumbers(l1, l2);
        System.out.println(listNode);

    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "com.yang7.ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
