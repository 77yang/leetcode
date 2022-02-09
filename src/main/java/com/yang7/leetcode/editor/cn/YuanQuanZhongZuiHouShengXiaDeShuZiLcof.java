//0,1,···,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字（删除后从下一个数字开始计数）。求出这个圆圈里剩下的最后一个数字。
// 
//
// 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。 
//
// 
//
// 示例 1： 
//
// 
//输入: n = 5, m = 3
//输出: 3
// 
//
// 示例 2： 
//
// 
//输入: n = 10, m = 17
//输出: 2
// 
//
// 
//
// 限制： 
//
// 
// 1 <= n <= 10^5 
// 1 <= m <= 10^6 
// 
// Related Topics 递归 数学 👍 529 👎 0


package com.yang7.leetcode.editor.cn;

import com.yang7.sword2offer.ListNode;

import java.util.Arrays;

public class YuanQuanZhongZuiHouShengXiaDeShuZiLcof {
    public static void main(String[] args) {
        Solution solution = new YuanQuanZhongZuiHouShengXiaDeShuZiLcof().new Solution();
        System.out.println(solution.lastRemaining(5, 2));
        System.out.println(solution.lastRemaining(5, 3));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lastRemaining(int n, int m) {
            int ans = 0; // 最后一轮剩下2个人，所以从2开始反推
            for (int i = 2; i <= n; i++) {
                ans = (ans + m) % i;
            }
            return ans;
        }

        public int lastRemaining1(int n, int m) {
            /**
             * 输入: n = 5, m = 3 输出: 3
             * 0,1,2,3,4
             * 0,1,3,4
             * 1,3,4
             * 1,3
             *
             */

            ListNode pre = null;
            ListNode head = null;
            for (int i = 0; i < n; i++) {
                ListNode cur = new ListNode(i);
                if (pre != null) {
                    pre.next = cur;
                }
                if (head == null) {
                    head = cur;
                }
                pre = cur;
            }

            pre.next = head;

            ListNode cur = head;

            int steps = 1;
            while (cur.next != null && cur.next != cur) {
                if (steps == m) {
                    pre.next = cur.next;
                    steps = 1;
                } else {
                    pre = cur;
                    steps++;
                }
                cur = cur.next;


            }
            return cur.val;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}