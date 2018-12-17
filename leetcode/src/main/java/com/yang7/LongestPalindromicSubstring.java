package com.yang7;

import javax.sound.midi.Soundbank;
import java.util.Objects;

/**
 * @Author: yangqi
 * @Date: 12/13/2018 2:56 PM
 * <p>
 * https://leetcode.com/problems/longest-palindromic-substring/
 * <p>
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * <p>
 * Example 1:
 * <p>
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 * <p>
 * Input: "cbbd"
 * Output: "bb"
 *
 *
 *
 *
 *A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10201.
 *
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        String str = s==null?"":s;

        /**
         * cbbd
         * output c
         * expect bb
         */
        int len = s.length();

        for (int i = len; i >0; i--) {
            for (int j = 0; j + i <=len; j++) {

                if (Objects.equals(s.charAt(j), s.charAt(j+i-1))) {
                    String substring = s.substring(j, i+j);
                    if (isPalindrome(substring)) {
                        return substring;
                    }
                }
            }
        }

        return str;
    }


    boolean  isPalindrome(String str) {
        int k1 = 0;
        int length = str.length();
        boolean isPalindrome = true;
        while (k1 < length-1 - k1 && isPalindrome) {
            if (str.charAt(k1) != str.charAt(length-1 - k1)) {
                isPalindrome = false;

            }
            k1++;
        }
        return isPalindrome;

    }


}
