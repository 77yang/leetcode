//给你一个非递减的 有序 整数数组，已知这个数组中恰好有一个整数，它的出现次数超过数组元素总数的 25%。
//
// 请你找到并返回这个整数 
//
// 
//
// 示例： 
//
// 
//输入：arr = [1,2,2,6,6,6,6,7,10]
//输出：6
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 10^4 
// 0 <= arr[i] <= 10^5 
// 
// Related Topics 数组 👍 54 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.HashMap;


public class ElementAppearingMoreThan25InSortedArray {
    public static void main(String[] args) {
        Solution solution = new ElementAppearingMoreThan25InSortedArray().new Solution();
        System.out.println(solution.findSpecialInteger(new int[]{1, 2, 3, 3}));
        System.out.println(solution.findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findSpecialInteger(int[] arr) {
            Integer targetV = arr.length * 25;
            HashMap<Integer, Integer> map = new HashMap();
            for (int i = 0; i < arr.length; i++) {
                Integer v = map.getOrDefault(arr[i], 0) + 1;
                if (v * 100 > targetV) {
                    return arr[i];
                }
                map.put(arr[i], v);
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}