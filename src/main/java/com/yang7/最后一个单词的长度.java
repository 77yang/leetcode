package com.yang7;

/**
 * 输入: "Hello World"
 * 输出: 5
 */
public class 最后一个单词的长度 {
    static class Solution {
        public int lengthOfLastWord(String s) {
            if (s == null) {
                return 0;
            }

            int count = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);
                if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                    count++;
                } else {

                    if (count > 0) {
                        return count;
                    }

                    count = 0;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            System.out.println(new Solution().lengthOfLastWord("hello world"));
            System.out.println(new Solution().lengthOfLastWord("hello a"));
        }
    }
}
