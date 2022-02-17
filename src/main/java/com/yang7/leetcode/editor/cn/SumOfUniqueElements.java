//给你一个整数数组 nums 。数组中唯一元素是那些只出现 恰好一次 的元素。
//
// 请你返回 nums 中唯一元素的 和 。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [1,2,3,2]
//输出：4
//解释：唯一元素为 [1,3] ，和为 4 。
// 
//
// 示例 2： 
//
// 输入：nums = [1,1,1,1,1]
//输出：0
//解释：没有唯一元素，和为 0 。
// 
//
// 示例 3 ： 
//
// 输入：nums = [1,2,3,4,5]
//输出：15
//解释：唯一元素为 [1,2,3,4,5] ，和为 15 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 100 
// 1 <= nums[i] <= 100 
// 
// Related Topics 数组 哈希表 计数 👍 60 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        Solution solution = new SumOfUniqueElements().new Solution();
        System.out.println(solution.sumOfUnique(new int[]{1, 2, 3, 2}));
        System.out.println(solution.sumOfUnique(new int[]{1, 1, 1, 1, 1}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int sumOfUnique(int[] nums) {
            Map<Integer, Integer> cnt = new HashMap();
            for (int num : nums) {
                cnt.put(num, cnt.getOrDefault(num, 0) + 1);
            }
            int ans = 0;
            for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
                int num = entry.getKey(), c = entry.getValue();
                if (c == 1) {
                    ans += num;
                }
            }
            return ans;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}