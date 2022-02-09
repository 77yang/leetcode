//给定一个非负整数 x ，计算并返回 x 的平方根，即实现 int sqrt(int x) 函数。
//
// 正数的平方根有两个，只输出其中的正数平方根。 
//
// 如果平方根不是整数，输出只保留整数的部分，小数部分将被舍去。 
//
// 
//
// 示例 1: 
//
// 
//输入: x = 4
//输出: 2
// 
//
// 示例 2: 
//
// 
//输入: x = 8
//输出: 2
//解释: 8 的平方根是 2.82842...，由于小数部分将被舍去，所以返回 2
// 
//
// 
//
// 提示: 
//
// 
// 0 <= x <= 2³¹ - 1 
// 
//
// 
//
// 注意：本题与主站 69 题相同： https://leetcode-cn.com/problems/sqrtx/ 
// Related Topics 数学 二分查找 👍 10 👎 0


package com.yang7.leetcode.editor.cn;

public class JJ0w9p {
    public static void main(String[] args) {
        Solution solution = new JJ0w9p().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int mySqrt(int x) {
            if (x == 0) return 0;
            int i = 1;
            while (i <= x) {
                int result = x / i;
                if (result > i) {
                    i++;
                } else if (result < i) {
                    break;
                } else {
                    return i;
                }
            }
            return i - 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}