//给定一个字符串 s ，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
//
// 
//
// 示例 1： 
//
// 
//输入：s = "Let's take LeetCode contest"
//输出："s'teL ekat edoCteeL tsetnoc"
// 
//
// 示例 2: 
//
// 
//输入： s = "God Ding"
//输出："doG gniD"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 5 * 10⁴ 
// s 包含可打印的 ASCII 字符。 
// s 不包含任何开头或结尾空格。 
// s 里 至少 有一个词。 
// s 中的所有单词都用一个空格隔开。 
// 
// Related Topics 双指针 字符串 👍 397 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.Stack;

public class ReverseWordsInAStringIii {
    public static void main(String[] args) {
        Solution solution = new ReverseWordsInAStringIii().new Solution();
        System.out.println(solution.reverseWords("Let's take LeetCode contest"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public String reverseWords(String s) {
            StringBuffer ret = new StringBuffer();
            int length = s.length();
            int i = 0;
            while (i < length) {
                int start = i;
                while (i < length && s.charAt(i) != ' ') {
                    i++;
                }
                for (int p = start; p < i; p++) {
                    ret.append(s.charAt(start + i - 1 - p));
                }
                while (i < length && s.charAt(i) == ' ') {
                    i++;
                    ret.append(' ');
                }
            }
            return ret.toString();
        }

        public String reverseWords1(String s) {

            Stack<Character> stack = new Stack();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');

                } else {
                    stack.push(s.charAt(i));
                }
            }
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}