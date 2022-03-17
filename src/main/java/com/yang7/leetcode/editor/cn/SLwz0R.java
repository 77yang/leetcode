//给定一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1], n = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1,2], n = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中结点的数目为 sz 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
//
// 
//
// 进阶：能尝试使用一趟扫描实现吗？ 
//
// 
//
// 注意：本题与主站 19 题相同： https://leetcode-cn.com/problems/remove-nth-node-from-end-
//of-list/ 
// Related Topics 链表 双指针 👍 29 👎 0


package com.yang7.leetcode.editor.cn;

import com.yang7.sword2offer.ListNode;
import com.yang7.utils.ListNodeUtil;

public class SLwz0R {
    public static void main(String[] args) {
        Solution solution = new SLwz0R().new Solution();
        System.out.println(solution.removeNthFromEnd(ListNodeUtil.convert(new int[]{1, 2, 3, 4, 5}), 2));
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode fast = head;
            while (n-- > 0) {
                fast = fast.next;
            }

            ListNode slow = head;
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode pre = dummy;
            while (true) {
//环形会导致死循环
                if (fast == null) {
                    pre.next = slow.next;
                    break;
                }
                pre = slow;
                slow = slow.next;
                fast = fast.next;
            }


            return dummy.next;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}