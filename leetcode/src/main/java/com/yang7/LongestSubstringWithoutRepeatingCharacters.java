package com.yang7;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: yangqi
 * @Date: 12/11/2018 6:06 PM
 *
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 *
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int maxLength=0,i=0,j=0;

        Set<Character> datas = new HashSet<>();

        while (i < len && j < len) {
            if (!datas.contains(s.charAt(j))) {
                datas.add(s.charAt(j++));
                maxLength = Math.max(maxLength, j - i);
            } else {
                datas.remove(s.charAt(i++));
            }
        }
        return maxLength;
    }



    public static void main(String[] args) {
        int result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb");
        System.out.println(result);
        result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb");
        System.out.println(result);
    }
}
