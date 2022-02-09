//给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
//
// 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。 
//
// 回文串不一定是字典当中的单词。 
//
// 
//
// 示例1： 
//
// 输入："tactcoa"
//输出：true（排列有"tacocat"、"atcocta"，等等）
// 
//
// 
// Related Topics 位运算 哈希表 字符串 👍 66 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutationLcci {
    public static void main(String[] args) {
        Solution solution = new PalindromePermutationLcci().new Solution();
        System.out.println(solution.canPermutePalindrome("tactcoa"));
        System.out.println(solution.canPermutePalindrome("ab"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canPermutePalindrome(String s) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char key = s.charAt(i);
                Integer orDefault = map.getOrDefault(key, 0);
                map.put(key, orDefault + 1);
            }
            int odd = 0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    odd++;
                    if (odd > 1) {
                        return false;
                    }
                }
            }
            return odd < 2;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}