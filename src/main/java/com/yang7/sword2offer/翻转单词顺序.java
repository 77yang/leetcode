package com.yang7.sword2offer;

public class 翻转单词顺序 {
    static class Solution {
        public String reverseWords(String s) {
            s = s.trim();
            int j = s.length() - 1, i = j;
            StringBuilder res = new StringBuilder();
            while(i >= 0) {
                while(i >= 0 && s.charAt(i) != ' ') {
                    i--;
                }
                res.append(s.substring(i + 1, j + 1) + " ");
                while(i >= 0 && s.charAt(i) == ' ') {
                    i--;
                }
                j = i;
            }
            return res.toString().trim();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords("abc 123"));
    }
}
