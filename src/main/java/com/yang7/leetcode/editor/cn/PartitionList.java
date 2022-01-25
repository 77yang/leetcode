//给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
//
// 你应当 保留 两个分区中每个节点的初始相对位置。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,4,3,2,5,2], x = 3
//输出：[1,2,2,4,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [2,1], x = 2
//输出：[1,2]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目在范围 [0, 200] 内 
// -100 <= Node.val <= 100 
// -200 <= x <= 200 
// 
// Related Topics 链表 双指针 👍 513 👎 0


package com.yang7.leetcode.editor.cn;

import com.yang7.sword2offer.ListNode;
import com.yang7.utils.ListNodeUtil;

public class PartitionList {
    public static void main(String[] args) {
        Solution solution = new PartitionList().new Solution();
        System.out.println(solution.partition(ListNodeUtil.convert(new int[]{1, 2}), 3));
        //Expected:[2,2,4,3,5]

        System.out.println(solution.partition(ListNodeUtil.convert(new int[]{4, 3, 2, 5, 2}), 3));
//        System.out.println(solution.partition(ListNodeUtil.convert(new int[]{2,1}), 2));
//        System.out.println(solution.partition(ListNodeUtil.convert(new int[]{1, 4, 3, 2, 5, 2}), 3));
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
        public ListNode partition(ListNode head, int x) {
            System.out.println(head);

            /**
             * 需要挂在的节点
             */
            ListNode mounted = null;
            ListNode current = head;
            ListNode pre = null;
            boolean mountedFlag = false;
            while (current != null) {

                if (current.val >= x && mounted == null && !mountedFlag) {
                    mounted = pre;
                    mountedFlag = true;
                }

                if (current.val < x && pre != null && mountedFlag) {

                    //摘除节点
                    pre.next = current.next;

                    if (mounted != null) {
                        //节点挂载到前面
                        ListNode next = mounted.next;
                        mounted.next = current;
                        current.next = next;

                    } else {
                        ListNode next = head;
                        head = current;
                        head.next = next;
                    }
                    mounted = current;

                }


                pre = current;
                current = current.next;


            }

            return head;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}