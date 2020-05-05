package com.yang7.sword2offer;

public class 左旋转字符串 {
    static class Solution {
        public String reverseLeftWords(String s, int n) {
            StringBuilder res = new StringBuilder();
            for(int i = n; i < s.length(); i++) {
                res.append(s.charAt(i));
            }
            for(int i = 0; i < n; i++) {
                res.append(s.charAt(i));
            }
            return res.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseLeftWords("123", 1));
    }
}
