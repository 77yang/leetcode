//给定一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
//
// 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [0]
//输出：[[],[0]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10 
// -10 <= nums[i] <= 10 
// nums 中的所有元素 互不相同 
// 
//
// 
//
// 注意：本题与主站 78 题相同： https://leetcode-cn.com/problems/subsets/ 
// Related Topics 位运算 数组 回溯 👍 21 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class TVdhkn {
    public static void main(String[] args) {
        Solution solution = new TVdhkn().new Solution();
        System.out.println(solution.subsets(new int[]{1, 2, 3}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            //bfs,遍历数组，将之前出现的所有可能序列，加上当前数字组成新序列
            List<List<Integer>> ans = new ArrayList<>();

            ans.add(new ArrayList<>());

            for (int i = 0; i < nums.length; ++i) {
                int size = ans.size();
                for (int j = 0; j < size; ++j) {
                    List newList = new ArrayList<>(ans.get(j));
                    newList.add(nums[i]);
                    ans.add(newList);
                }
            }

            return ans;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}