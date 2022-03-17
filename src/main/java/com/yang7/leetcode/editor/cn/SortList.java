//给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
//
// 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [4,2,1,3]
//输出：[1,2,3,4]
// 
//
// 示例 2： 
//
// 
//输入：head = [-1,5,3,4,0]
//输出：[-1,0,3,4,5]
// 
//
// 示例 3： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目在范围 [0, 5 * 10⁴] 内 
// -10⁵ <= Node.val <= 10⁵ 
// 
//
// 
//
// 进阶：你可以在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序吗？ 
// Related Topics 链表 双指针 分治 排序 归并排序 👍 1495 👎 0


package com.yang7.leetcode.editor.cn;

import com.yang7.sword2offer.ListNode;
import com.yang7.utils.ListNodeUtil;

import java.util.PriorityQueue;

public class SortList {
    public static void main(String[] args) {
        Solution solution = new SortList().new Solution();
        System.out.println(solution.sortList(ListNodeUtil.convert(new int[]{2, 1, 4, 3})));
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
        public ListNode sortList(ListNode head) {
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            ListNode cur = head;
            while (cur != null) {
                queue.add(cur.val);
                cur = cur.next;

            }
            ListNode dumpy = new ListNode(0);
            cur = dumpy;
            while (!queue.isEmpty()) {
                Integer poll = queue.poll();
                cur.next = new ListNode(poll);
                cur = cur.next;
            }
            return dumpy.next;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}