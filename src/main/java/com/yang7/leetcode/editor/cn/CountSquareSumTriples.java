//一个 平方和三元组 (a,b,c) 指的是满足 a² + b² = c² 的 整数 三元组 a，b 和 c 。
//
// 给你一个整数 n ，请你返回满足 1 <= a, b, c <= n 的 平方和三元组 的数目。 
//
// 
//
// 示例 1： 
//
// 输入：n = 5
//输出：2
//解释：平方和三元组为 (3,4,5) 和 (4,3,5) 。
// 
//
// 示例 2： 
//
// 输入：n = 10
//输出：4
//解释：平方和三元组为 (3,4,5)，(4,3,5)，(6,8,10) 和 (8,6,10) 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 250 
// 
// Related Topics 数学 枚举 👍 9 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

public class CountSquareSumTriples {
    public static void main(String[] args) {
        Solution solution = new CountSquareSumTriples().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countTriples(int n) {
            int result = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    int a = i * i;
                    int b = j * j;
                    int c = Math.max(i, j);
                    for (int k = c + 1; k <= n; k++) {
                        if (a + b == (k * k)) {
                            result += 2;
                        }
                    }
                }
            }
            return result;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}