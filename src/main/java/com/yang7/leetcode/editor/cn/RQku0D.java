//给定一个非空字符串 s，请判断如果 最多 从字符串中删除一个字符能否得到一个回文字符串。
//
// 
//
// 示例 1: 
//
// 
//输入: s = "aba"
//输出: true
// 
//
// 示例 2: 
//
// 
//输入: s = "abca"
//输出: true
//解释: 可以删除 "c" 字符 或者 "b" 字符
// 
//
// 示例 3: 
//
// 
//输入: s = "abc"
//输出: false 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length <= 10⁵ 
// s 由小写英文字母组成 
// 
//
// 
//
// 注意：本题与主站 680 题相同： https://leetcode-cn.com/problems/valid-palindrome-ii/ 
// Related Topics 贪心 双指针 字符串 👍 21 👎 0


package com.yang7.leetcode.editor.cn;

public class RQku0D {
    public static void main(String[] args) {
        Solution solution = new RQku0D().new Solution();
        System.out.println(solution.validPalindrome("tebbem"));
        System.out.println(solution.validPalindrome("aba"));
        System.out.println(solution.validPalindrome("abca"));
        System.out.println(solution.validPalindrome("abc"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean validPalindrome(String s) {
            if (s.length() <= 2) return true;
            int left = 0, right = s.length() - 1;
            int count = 1;//记录表示只能删除一次
            boolean flag1 = true, flag2 = true;
            //当两个字符不相等时，第一次先判断left的下一个是不是和right相等
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    if (s.charAt(left + 1) == s.charAt(right) && count == 1) {
                        left++;
                        count--;
                    } else {
                        flag1 = false;
                        break;
                    }
                }
                left++;
                right--;
            }
            //第一个方法成功直接返回true;
            if (flag1 == true) return true;
            count = 1;
            left = 0;
            right = s.length() - 1;
            //如果第一个方法失败，第二次判断left的字符是不是和right的下一个字符相等
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    if (s.charAt(left) == s.charAt(right - 1) && count == 1) {
                        right--;
                        count--;
                    } else {
                        flag2 = false;
                        break;
                    }
                }
                left++;
                right--;
            }
            //如果两次方法都失败则返回false
            return flag1 || flag2;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}