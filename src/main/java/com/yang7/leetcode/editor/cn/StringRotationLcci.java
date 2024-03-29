//字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。
//
// 示例1: 
//
//  输入：s1 = "waterbottle", s2 = "erbottlewat"
// 输出：True
// 
//
// 示例2: 
//
//  输入：s1 = "aa", s2 = "aba"
// 输出：False
// 
//
// 
// 
//
// 提示： 
//
// 
// 字符串长度在[0, 100000]范围内。 
// 
//
// 说明: 
//
// 
// 你能只调用一次检查子串的方法吗？ 
// 
// Related Topics 字符串 字符串匹配 👍 97 👎 0


package com.yang7.leetcode.editor.cn;

public class StringRotationLcci {
    public static void main(String[] args) {
        Solution solution = new StringRotationLcci().new Solution();
        System.out.println(solution.isFlipedString("waterbottle", "erbottlewat"));
        System.out.println(solution.isFlipedString("aa", "aba"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isFlipedString(String s1, String s2) {
            return (s2 + s2).contains(s1) && s1.length() == s2.length();

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}