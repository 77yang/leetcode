//给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
//
// 示例 1: 
//
// 
//输入: "abab"
//
//输出: True
//
//解释: 可由子字符串 "ab" 重复两次构成。
// 
//
// 示例 2: 
//
// 
//输入: "aba"
//
//输出: False
// 
//
// 示例 3: 
//
// 
//输入: "abcabcabcabc"
//
//输出: True
//
//解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
// 
// Related Topics 字符串 字符串匹配 👍 608 👎 0


package com.yang7.leetcode.editor.cn;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        Solution solution = new RepeatedSubstringPattern().new Solution();
        System.out.println(solution.repeatedSubstringPattern("ababab"));
        System.out.println(solution.repeatedSubstringPattern("abab"));

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean repeatedSubstringPattern(String s) {
            int n = s.length();
            int span = 1;
            while (span < n) {
                String word = s.substring(0, span);
                int sameCount = 0;
                for (int i = span; i <= n - span; i+=span) {
                    int endIndex = i + span;
                    String substring = s.substring(i, endIndex);
                    if (!substring.equals(word)) {
                        break;
                    } else {
                        sameCount++;
                    }
                }

                if ((sameCount+1) * span == n) {
                    return true;
                }
                span++;
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}