//给定一个字符串 s ，验证 s 是否是 回文串 ，只考虑字母和数字字符，可以忽略字母的大小写。
//
// 本题中，将空字符串定义为有效的 回文串 。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "A man, a plan, a canal: Panama"
//输出: true
//解释："amanaplanacanalpanama" 是回文串 
//
// 示例 2: 
//
// 
//输入: s = "race a car"
//输出: false
//解释："raceacar" 不是回文串 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 2 * 10⁵ 
// 字符串 s 由 ASCII 字符组成 
// 
//
// 
//
// 注意：本题与主站 125 题相同： https://leetcode-cn.com/problems/valid-palindrome/ 
// Related Topics 双指针 字符串 👍 15 👎 0


package com.yang7.leetcode.editor.cn;

public class XltzEq {
    public static void main(String[] args) {
        Solution solution = new XltzEq().new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution.isPalindrome("race a car"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(String s) {
            String lowerCase = s.toLowerCase();
            int start = 0;
            int end = lowerCase.length() - 1;
            while (start < end) {
                char c1 = lowerCase.charAt(start);
                if (!Character.isLetterOrDigit(c1)) {
                    start++;
                    continue;
                }
                char c2 = lowerCase.charAt(end);
                if (!Character.isLetterOrDigit(c2)) {
                    end--;
                    continue;
                }

                if (c1 != c2) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}