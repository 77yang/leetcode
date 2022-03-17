//自除数 是指可以被它包含的每一位数整除的数。
//
// 
// 例如，128 是一个 自除数 ，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。 
// 
//
// 自除数 不允许包含 0 。 
//
// 给定两个整数 left 和 right ，返回一个列表，列表的元素是范围 [left, right] 内所有的 自除数 。 
//
// 
//
// 示例 1： 
//
// 
//输入：left = 1, right = 22
//输出：[1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
// 
//
// 示例 2: 
//
// 
//输入：left = 47, right = 85
//输出：[48,55,66,77]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= left <= right <= 10⁴ 
// 
// Related Topics 数学 👍 149 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        Solution solution = new SelfDividingNumbers().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> ans = new ArrayList();
            for (int n = left; n <= right; ++n) {
                if (selfDividing(n)) ans.add(n);
            }
            return ans;
        }

        public boolean selfDividing(int n) {
            int x = n;
            while (x > 0) {
                int d = x % 10;
                x /= 10;
                if (d == 0 || (n % d) > 0) return false;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}