//编写一个函数，检查输入的链表是否是回文的。
//
// 
//
// 示例 1： 
//
// 输入： 1->2
//输出： false 
// 
//
// 示例 2： 
//
// 输入： 1->2->2->1
//输出： true 
// 
//
// 
//
// 进阶： 
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 栈 递归 链表 双指针 👍 91 👎 0


package com.yang7.leetcode.editor.cn;

import com.yang7.sword2offer.ListNode;
import com.yang7.utils.ListNodeUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PalindromeLinkedListLcci {
    public static void main(String[] args) {
        Solution solution = new PalindromeLinkedListLcci().new Solution();
        System.out.println(solution.isPalindrome(ListNodeUtil.convert(new int[]{0, 0, 1})));
        System.out.println(solution.isPalindrome(ListNodeUtil.convert(new int[]{1, 0, 0})));
        System.out.println(solution.isPalindrome(ListNodeUtil.convert(new int[]{1, 2, 2, 1})));
        System.out.println(solution.isPalindrome(ListNodeUtil.convert(new int[]{1, 2, 3, 1})));
        System.out.println(solution.isPalindrome(ListNodeUtil.convert(new int[]{1})));
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
        public boolean isPalindrome(ListNode head) {
            List<Integer> vals = new ArrayList<Integer>();

            // 将链表的值复制到数组中
            ListNode currentNode = head;
            while (currentNode != null) {
                vals.add(currentNode.val);
                currentNode = currentNode.next;
            }

            // 使用双指针判断是否回文
            int front = 0;
            int back = vals.size() - 1;
            while (front < back) {
                if (!vals.get(front).equals(vals.get(back))) {
                    return false;
                }
                front++;
                back--;
            }
            return true;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}