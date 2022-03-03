//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：["((()))","(()())","(())()","()(())","()()()"]
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：["()"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 8 
// 
// Related Topics 字符串 动态规划 回溯 👍 2380 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        Solution solution = new GenerateParentheses().new Solution();
        System.out.println(solution.generateParenthesis(3));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<String> res = new ArrayList<>();

        public List<String> generateParenthesis(int n) {
            if (n <= 0) {
                return res;
            }
            dp("", n, n);
            return res;
        }

        private void dp(String target, int left, int right) {

            if (left < 0 || right < 0) {

                return;
            }
            if (left == 0 && right == 0) {
                res.add(target);
                return;
            }




            if (left == right) {

                //下一个只能取(
                dp(target + "(", left - 1, right);


            } else if (left < right) {
                //剩余左括号小于右括号，下一个可以用左括号也可以用右括号
                dp(target + "(", left - 1, right);
                dp(target + ")", left, right - 1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}