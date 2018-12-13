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
        int max = 0;


        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (Objects.equals(s.charAt(i), s.charAt(j))) {
                    String substring = s.substring(i, j + 1);
//check substring is a palindrome



                    if (j - i >= max) {
                        max = j - i;
                        str = substring;

                    }
                }
            }
        }

        if (str.equals(s)&&s.length()>0) {
            str = s.charAt(0)+"";
        }

        return str;
    }

    public static void main(String[] args) {
        String s = new LongestPalindromicSubstring().longestPalindrome("abcda");
        System.out.println(s);
    }
}
