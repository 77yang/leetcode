//给定一个已排序的链表的头 head ， 删除原始链表中所有重复数字的节点，只留下不同的数字 。返回 已排序的链表 。
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,3,4,4,5]
//输出：[1,2,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1,1,1,2,3]
//输出：[2,3]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点数目在范围 [0, 300] 内 
// -100 <= Node.val <= 100 
// 题目数据保证链表已经按升序 排列 
// 
// Related Topics 链表 双指针 👍 826 👎 0


package com.yang7.leetcode.editor.cn;

import com.yang7.sword2offer.ListNode;
import com.yang7.utils.ListNodeUtil;

public class RemoveDuplicatesFromSortedListIi {
    public static void main(String[] args) {
        Solution solution = new RemoveDuplicatesFromSortedListIi().new Solution();
        System.out.println(solution.deleteDuplicates(ListNodeUtil.convert(new int[]{1, 1, 1, 2, 3})));
        System.out.println(solution.deleteDuplicates(ListNodeUtil.convert(new int[]{1, 2, 3, 3, 4, 4, 5})));
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

        public ListNode deleteDuplicates(ListNode head) {

            /**
             * 1.找到第一个重复的元素，保留其前一个节点A
             *
             * 2.找到最后一个重复的元素，保留其后面一个节点B
             *
             * 3.A.next = B
             */

            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode fast = dummy.next;
            ListNode slow = dummy;

            while (fast != null) {
                fast = fast.next;

                if (fast == null) {
                    break;
                }

                if (fast.val == slow.next.val) {
                    while (true) {
                        ListNode next = fast.next;
                        if (next != null) {
                            if (next.val != slow.next.val) {
                                slow.next = next;
                                fast = next;
                                break;
                            }
                        } else {
                            slow.next = null;
                        }

                        fast = next;

                        if (fast == null) {
                            slow.next = null;
                            break;
                        }
                    }


                } else {
                    slow = slow.next;
                }

            }

            return dummy.next;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}