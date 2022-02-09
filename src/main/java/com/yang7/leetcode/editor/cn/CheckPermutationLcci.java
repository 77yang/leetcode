//给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
//
// 示例 1： 
//
// 输入: s1 = "abc", s2 = "bca"
//输出: true 
// 
//
// 示例 2： 
//
// 输入: s1 = "abc", s2 = "bad"
//输出: false
// 
//
// 说明： 
//
// 
// 0 <= len(s1) <= 100 
// 0 <= len(s2) <= 100 
// 
// Related Topics 哈希表 字符串 排序 👍 57 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.*;

public class CheckPermutationLcci {
    public static void main(String[] args) {
        Solution solution = new CheckPermutationLcci().new Solution();
        System.out.println(solution.CheckPermutation("abc", "bca"));
        System.out.println(solution.CheckPermutation("abc", "bad"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean CheckPermutation(String s1, String s2) {
            if (s1.length() != s2.length()) {
                return false;
            }
            Map<Character, Integer> map = new HashMap();
            for (int i = 0; i < s1.length(); i++) {
                char key = s1.charAt(i);
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            for (int i = 0; i < s2.length(); i++) {
                char key = s2.charAt(i);
                Integer val = map.get(key);
                if (val == null || val < 1) {
                    return false;
                }
                map.put(key, val - 1);
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}