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
 * Input
 * "abcda"
 * Output
 * "abcda"
 * Expected
 * "a"
 *
 *
 *A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10201.
 *
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        String str = s==null?"":s;

        if (str.length() < 2) {
            return str;
        }

        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = len-1; j>=i; j--) {
                if (Objects.equals(s.charAt(i), s.charAt(j))) {
                    String substring = s.substring(i, j + 1);
//cbbd
                    int k1 = 0;
                    int length = substring.length();
                    boolean isPalindrome = true;
                    while (k1 < length-1 - k1 && isPalindrome) {
                        if (substring.charAt(k1) != substring.charAt(length-1 - k1)) {
                            isPalindrome = false;

                        }
                        k1++;
                    }



                    if (isPalindrome) {
                        return substring;

                    }


                }



            }
        }


        return str;
    }


}
