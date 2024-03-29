//给定两个字符串, A 和 B。
//
// A 的旋转操作就是将 A 最左边的字符移动到最右边。 例如, 若 A = 'abcde'，在移动一次之后结果就是'bcdea' 。如果在若干次旋转操作之后
//，A 能变成B，那么返回True。 
//
// 
//示例 1:
//输入: A = 'abcde', B = 'cdeab'
//输出: true
//
//示例 2:
//输入: A = 'abcde', B = 'abced'
//输出: false 
//
// 注意： 
//
// 
// A 和 B 长度不超过 100。 
// 
// Related Topics 字符串 字符串匹配 👍 160 👎 0


package com.yang7.leetcode.editor.cn;

public class RotateString {
    public static void main(String[] args) {
        Solution solution = new RotateString().new Solution();
        System.out.println(solution.rotateString("aa", "a"));
        System.out.println(solution.rotateString("abcde", "cdeab"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean rotateString(String s, String goal) {
            return s.length() == goal.length() && (s + s).contains(goal);
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}