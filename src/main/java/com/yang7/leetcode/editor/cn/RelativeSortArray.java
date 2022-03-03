//给你两个数组，arr1 和 arr2，arr2 中的元素各不相同，arr2 中的每个元素都出现在 arr1 中。
//
// 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末
//尾。 
//
// 
//
// 示例 1： 
//
// 
//输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//输出：[2,2,2,1,4,3,3,9,6,7,19]
// 
//
// 示例 2: 
//
// 
//输入：arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
//输出：[22,28,8,6,17,44]
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
// Related Topics 数组 哈希表 计数排序 排序 👍 202 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.*;

public class RelativeSortArray {
    public static void main(String[] args) {
        Solution solution = new RelativeSortArray().new Solution();
        int[] target = solution.relativeSortArray(new int[]{33, 22, 48, 4, 39, 36, 41, 47, 15, 45}, new int[]{22, 33, 48, 4});
        System.out.println(Arrays.toString(target));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {

            HashMap<Integer, Integer> map = new HashMap();
            for (int i : arr2) {
                map.put(i, 0);
            }

            List<Integer> ls = new ArrayList<>();

            for (int i : arr1) {
                Integer v = map.get(i);
                if (v == null) {
                    ls.add(i);

                } else {
                    map.put(i, v + 1);
                }
            }

            int[] target = new int[arr1.length];

            int j = 0;
            for (int i : arr2) {
                Integer count = map.get(i);
                while (count-- > 0) {
                    target[j++] = i;
                }
            }


            ls.sort(Integer::compareTo);

            for (Integer i : ls) {
                target[j++] = i;
            }

            return target;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}