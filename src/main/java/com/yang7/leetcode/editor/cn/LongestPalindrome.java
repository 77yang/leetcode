//给定一个包含大写字母和小写字母的字符串 s ，返回 通过这些字母构造成的 最长的回文串 。
//
// 在构造过程中，请注意 区分大小写 。比如 "Aa" 不能当做一个回文字符串。 
//
// 
//
// 示例 1: 
//
// 
//输入:s = "abccccdd"
//输出:7
//解释:
//我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
// 
//
// 示例 2: 
//
// 
//输入:s = "a"
//输入:1
// 
//
// 示例 3: 
//
// 
//输入:s = "bb"
//输入: 2
// 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length <= 2000 
// s 只能由小写和/或大写英文字母组成 
// 
// Related Topics 贪心 哈希表 字符串 👍 380 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        Solution solution = new LongestPalindrome().new Solution();
        System.out.println(solution.longestPalindrome("ccc"));
        System.out.println(solution.longestPalindrome("abccccdd"));
        System.out.println(solution.longestPalindrome("a"));
        System.out.println(solution.longestPalindrome("bb"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestPalindrome(String s) {
            if (s == null || s.length() < 1) {
                return 0;
            }
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char key = s.charAt(i);
                map.put(key, map.getOrDefault(key, 0) + 1);

            }

            int count = 0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                Integer value = entry.getValue();
                if (value > 1) {
                    count += value / 2 * 2;
                }
            }
            return count == s.length() ? count : count + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}