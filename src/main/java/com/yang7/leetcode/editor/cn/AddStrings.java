//给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和并同样以字符串形式返回。
//
// 你不能使用任何內建的用于处理大整数的库（比如 BigInteger）， 也不能直接将输入的字符串转换为整数形式。 
//
// 
//
// 示例 1： 
//
// 
//输入：num1 = "11", num2 = "123"
//输出："134"
// 
//
// 示例 2： 
//
// 
//输入：num1 = "456", num2 = "77"
//输出："533"
// 
//
// 示例 3： 
//
// 
//输入：num1 = "0", num2 = "0"
//输出："0"
// 
//
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num1.length, num2.length <= 10⁴ 
// num1 和num2 都只包含数字 0-9 
// num1 和num2 都不包含任何前导零 
// 
// Related Topics 数学 字符串 模拟 👍 500 👎 0


package com.yang7.leetcode.editor.cn;

public class AddStrings {
    public static void main(String[] args) {
        Solution solution = new AddStrings().new Solution();
        System.out.println(solution.addStrings("1", "9"));
        System.out.println(solution.addStrings("11", "123"));
        System.out.println(solution.addStrings("456", "77"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addStrings(String num1, String num2) {
            int m = num1.length();
            int n = num2.length();
            if (n > m) {
                // 这样确保前面的是大的，后面好处理一点
                return addStrings(num2, num1);
            }

            StringBuilder sb = new StringBuilder();
            int fac = 0;
            for (int i = 0; i < m; i++) {
                int a = num1.charAt(m - 1 - i) - '0';
                int b = n - 1 - i < 0 ? 0 : (num2.charAt(n - 1 - i) - '0');
                int c = a + b + fac;
                if (c >= 10) {
                    fac = 1;
                    c = c % 10;
                } else {
                    fac = 0;
                }
                // 先按顺序存储
                sb.append(c);
            }
            // 进1别忘了
            if (fac == 1) {
                sb.append(fac);
            }

            return sb.reverse().toString();
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}