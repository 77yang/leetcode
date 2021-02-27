package com.yang7;

/**
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 */
public class 验证回文串 {
    public  boolean isPalindrome(String s) {
        int last = s.length() - 1;
        int i = 0;
        while (i < last) {
            char start = s.charAt(i);
            if (!valid(start)) {
                i++;
                continue;
            }
            char end = s.charAt(last);
            if (!valid(end)) {
                last--;
                continue;
            }


            if (Character.toLowerCase(start) != (Character.toLowerCase(end))) {
                return false;
            }
            i++;
            last--;
        }


        return true;
    }

    public boolean valid(char c) {
        return ('0' <= c && c <= '9') || ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');


    }


    public static void main(String[] args) {
        //System.out.println( new 验证回文串().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println( new 验证回文串().isPalindrome("aa"));


    }
}
