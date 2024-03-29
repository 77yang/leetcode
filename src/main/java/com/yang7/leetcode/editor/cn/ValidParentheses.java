//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 示例 4： 
//
// 
//输入：s = "([)]"
//输出：false
// 
//
// 示例 5： 
//
// 
//输入：s = "{[]}"
//输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁴ 
// s 仅由括号 '()[]{}' 组成 
// 
// Related Topics 栈 字符串 👍 2910 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("["));
        System.out.println(solution.isValid("{[]}"));
        System.out.println(solution.isValid("{[)}"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            int n = s.length();

            String data = "({[";


            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (data.indexOf(c) >= 0) {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    Character pop = stack.pop();
                    if (c == ')' && pop == '(') {

                    } else if (c == ']' && pop == '[') {

                    } else if (c == '}' && pop == '{') {

                    } else {
                        return false;
                    }

                }

            }


            return stack.isEmpty();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}