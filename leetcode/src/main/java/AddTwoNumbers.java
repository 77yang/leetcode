import java.math.BigInteger;

/**
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 *
 *https://leetcode.com/problems/add-two-numbers/
 * @Author: yangqi
 * @Date: 12/7/2018 6:00 PM
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        char[] chars =  getNumber(l2).add(getNumber(l1)).toString().toCharArray();
        ListNode node = null;
        ListNode head = null;
        for (int i1 = chars.length - 1; i1 >= 0; i1--) {
            ListNode listNode = new ListNode(Character.getNumericValue(chars[i1]));
            if (node == null) {
                head = listNode;
                node = listNode;
            } else {
                node.next = listNode;
                node = node.next;
            }

        }
        return head;

    }

    private static BigInteger getNumber(ListNode l1) {
        String s1 = "";
        s1 = l1.val + s1;
        while (l1.next != null) {
            l1 = l1.next;
            s1 = l1.val + s1;
        }
        return new BigInteger(s1);
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next = new ListNode(3);


        ListNode l2 = new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next = new ListNode(4);


        ListNode listNode = new AddTwoNumbers().addTwoNumbers(l1, l2);
        System.out.println(Integer.MAX_VALUE);

    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
