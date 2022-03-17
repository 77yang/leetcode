//给定一个整数 num，将其转化为 7 进制，并以字符串形式输出。
//
// 
//
// 示例 1: 
//
// 
//输入: num = 100
//输出: "202"
// 
//
// 示例 2: 
//
// 
//输入: num = -7
//输出: "-10"
// 
//
// 
//
// 提示： 
//
// 
// -10⁷ <= num <= 10⁷ 
// 
// Related Topics 数学 👍 135 👎 0


package com.yang7.leetcode.editor.cn;

public class Base7 {
    public static void main(String[] args) {
        Solution solution = new Base7().new Solution();
        System.out.println(solution.convertToBase7(-7));
        System.out.println(solution.convertToBase7(100));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String convertToBase7(int n) {
            boolean flag = n < 0;
            if (flag) n = -n;
            StringBuilder sb = new StringBuilder();
            do {
                sb.append(n % 7);
                n /= 7;
            } while (n != 0);
            sb.reverse();
            return flag ? "-" + sb : sb.toString();
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}