package com.yang7;

/**
 * 1->2->3->2->1
 *
 * 1<-2<-3 2->1
 *
 *
 */
public class 回文链表 {
  static class Solution {
        public boolean isPalindrome(ListNode head) {
            if(head == null || head.next == null) {
                return true;
            }
            ListNode slow = head, fast = head;
            ListNode pre = head, prepre = null;
            while(fast != null && fast.next != null) {
                pre = slow;
                slow = slow.next;
                fast = fast.next.next;
                pre.next = prepre;
                prepre = pre;
            }
            if(fast != null) {
                slow = slow.next;
            }
            while(pre != null && slow != null) {
                if(pre.val != slow.val) {
                    return false;
                }
                pre = pre.next;
                slow = slow.next;
            }
            return true;
        }

        public static void main(String[] args) {
            ListNode l1 = new ListNode(1);
            ListNode l2 = new ListNode(2);
            ListNode l3 = new ListNode(4);
            ListNode l4 = new ListNode(2);
            ListNode l5 = new ListNode(1);
            l1.next = l2;
            l2.next = l3;
            l3.next = l4;
            l4.next = l5;
            boolean palindrome = new Solution().isPalindrome(l1);
            System.out.println(palindrome);


            ListNode l6 = new ListNode(1);
            ListNode l7 = new ListNode(2);
            l6.next = l7;
             palindrome = new Solution().isPalindrome(l6);
            System.out.println(palindrome);



            ListNode l8 = new ListNode(1);
            palindrome = new Solution().isPalindrome(l8);
            System.out.println(palindrome);


            l6.val = 0;
            l7.val = 0;
            l6.next = l7;
            palindrome = new Solution().isPalindrome(l6);
            System.out.println(palindrome);
        }
    }
}
