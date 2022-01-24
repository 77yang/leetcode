//编写一个算法来判断一个数 n 是不是快乐数。
//
// 「快乐数」定义为： 
//
// 
// 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。 
// 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。 
// 如果 可以变为 1，那么这个数就是快乐数。 
// 
//
// 如果 n 是快乐数就返回 true ；不是，则返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 19
//输出：true
//解释：
//1² + 9² = 82
//8² + 2² = 68
//6² + 8² = 100
//1² + 0² + 0² = 1
// 
//
// 示例 2： 
//
// 
//输入：n = 2
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 2³¹ - 1 
// 
// Related Topics 哈希表 数学 双指针 👍 785 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        Solution solution = new HappyNumber().new Solution();
        System.out.println(solution.isHappy(7));
        System.out.println(solution.isHappy(2));
        System.out.println(solution.isHappy(19));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isHappy(int n) {
            //2   2^2=4   4^2=16  16=1^2+6^2=37 ....
            Set set = new HashSet<Integer>();

            int last = n;

            while (true) {
                String s = String.valueOf(last);
                int total = 0;
                for (int i = 0; i < s.length(); i++) {
                    int num = Integer.parseInt(String.valueOf(s.charAt(i)));
                    total += num * num;

                }
                if (set.contains(total)) {
                    return false;
                }

                if (total == 1) {
                    return true;
                }

                set.add(total);
                last = total;

            }
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}