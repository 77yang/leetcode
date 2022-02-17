//给你一个混合字符串 s ，请你返回 s 中 第二大 的数字，如果不存在第二大的数字，请你返回 -1 。
//
// 混合字符串 由小写英文字母和数字组成。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "dfa12321afd"
//输出：2
//解释：出现在 s 中的数字包括 [1, 2, 3] 。第二大的数字是 2 。
// 
//
// 示例 2： 
//
// 
//输入：s = "abc1111"
//输出：-1
//解释：出现在 s 中的数字只包含 [1] 。没有第二大的数字。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 500 
// s 只包含小写英文字母和（或）数字。 
// 
// Related Topics 哈希表 字符串 👍 7 👎 0


package com.yang7.leetcode.editor.cn;

public class SecondLargestDigitInAString {
    public static void main(String[] args) {
        Solution solution = new SecondLargestDigitInAString().new Solution();
        System.out.println(solution.secondHighest("dfa12321afd"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int secondHighest(String s) {
            //2,3
            int[] arr = new int[10];
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= '0' && c <= '9') {
                    arr[c - '0'] += 1;
                }
            }

            int count = 0;
            int p = 0;
            for (int j = arr.length - 1; j >= 0; j--) {
                if (count >= 2) {
                    break;
                }
                if (arr[j] != 0) {
                    count++;
                    p = j;
                }
            }

            if (count != 2) {
                return -1;
            } else {
                return p;
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}