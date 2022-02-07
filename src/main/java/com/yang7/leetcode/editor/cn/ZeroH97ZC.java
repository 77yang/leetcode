//给定两个数组，arr1 和 arr2，
//
// 
// arr2 中的元素各不相同 
// arr2 中的每个元素都出现在 arr1 中 
// 
//
// 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末
//尾。 
//
// 
//
// 示例： 
//
// 
//输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//输出：[2,2,2,1,4,3,3,9,6,7,19]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr1.length, arr2.length <= 1000 
// 0 <= arr1[i], arr2[i] <= 1000 
// arr2 中的元素 arr2[i] 各不相同 
// arr2 中的每个元素 arr2[i] 都出现在 arr1 中 
// 
//
// 
//
// 注意：本题与主站 1122 题相同：https://leetcode-cn.com/problems/relative-sort-array/ 
// Related Topics 数组 哈希表 计数排序 排序 👍 15 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ZeroH97ZC {
    public static void main(String[] args) {
        Solution solution = new ZeroH97ZC().new Solution();
        System.out.println(Arrays.toString(solution.relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6})));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {

            Map<Integer, Integer> map = new HashMap();
            PriorityQueue<Integer> queue = new PriorityQueue();
            for (int k : arr1) {
                map.put(k, map.getOrDefault(k, 0) + 1);
            }


            int[] result = new int[arr1.length];
            int i = 0;
            for (int k : arr2) {
                Integer count = map.get(k);
                for (int j = 0; j < count; j++) {
                    result[i++] = k;
                }
                map.remove(k);
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                Integer count = entry.getValue();
                Integer key = entry.getKey();
                for (int j = 0; j < count; j++) {
                    queue.add(key);
                }
            }

            while (!queue.isEmpty()) {
                result[i++] = queue.poll();
            }

            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}