//实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
//
// 注意：本题相对原题稍作改动 
//
// 示例： 
//
// 输入： 1->2->3->4->5 和 k = 2
//输出： 4 
//
// 说明： 
//
// 给定的 k 保证是有效的。 
// Related Topics 链表 双指针 👍 91 👎 0


package com.yang7.leetcode.editor.cn;

import com.yang7.sword2offer.ListNode;
import com.yang7.utils.ListNodeUtil;

public class KthNodeFromEndOfListLcci {
    public static void main(String[] args) {
        Solution solution = new KthNodeFromEndOfListLcci().new Solution();
        System.out.println(solution.kthToLast(ListNodeUtil.convert(new int[]{1, 2, 3, 4, 5}), 5));
        System.out.println(solution.kthToLast(ListNodeUtil.convert(new int[]{1, 2, 3, 4, 5}), 2));
        System.out.println(solution.kthToLast(ListNodeUtil.convert(new int[]{1, 2, 3, 4, 5}), 3));
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public int kthToLast(ListNode head, int k) {
            ListNode dummyHead = new ListNode(-1);
            dummyHead.next = head;
            ListNode p = dummyHead;
            ListNode q = dummyHead;
            for (int i = 0; i < k; i++) {
                q = q.next;
            }
            while (q!=null) {
                q = q.next;
                p = p.next;
            }
            return p.val;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}