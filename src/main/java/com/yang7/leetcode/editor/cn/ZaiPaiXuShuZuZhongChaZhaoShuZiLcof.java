//统计一个数字在排序数组中出现的次数。
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [5,7,7,8,8,10], target = 8
//输出: 2 
//
// 示例 2: 
//
// 
//输入: nums = [5,7,7,8,8,10], target = 6
//输出: 0 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// nums 是一个非递减数组 
// -10⁹ <= target <= 10⁹ 
// 
//
// 
//
// 注意：本题与主站 34 题相同（仅返回值不同）：https://leetcode-cn.com/problems/find-first-and-last-
//position-of-element-in-sorted-array/ 
// Related Topics 数组 二分查找 👍 257 👎 0


package com.yang7.leetcode.editor.cn;

public class ZaiPaiXuShuZuZhongChaZhaoShuZiLcof {
    public static void main(String[] args) {
        Solution solution = new ZaiPaiXuShuZuZhongChaZhaoShuZiLcof().new Solution();
        System.out.println(solution.search(new int[]{1, 2, 3}, 2));
        System.out.println(solution.search(new int[]{2, 2, 2, 2, 8}, 2));
        System.out.println(solution.search(new int[]{2, 2, 2, 2, 8}, 8));
        System.out.println(solution.search(new int[]{2, 2, 2, 2, 8}, 3));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int search(int[] nums, int target) {
            int left = getLeftBound(nums, target);
            int total = 0;
            for (int i = left; i < nums.length; i++) {
                if (nums[i] == target) {
                    total++;
                } else {
                    break;
                }
            }
            return total;
        }

        //寻找左侧边界
        public int getLeftBound(int[] nums, int target) {
            int lo = 0;
            int hi = nums.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (nums[mid] < target) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
            return lo;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}