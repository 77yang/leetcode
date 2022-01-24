//给定两个数组，编写一个函数来计算它们的交集。
//
// 
//
// 示例 1： 
//
// 输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2]
// 
//
// 示例 2： 
//
// 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[9,4] 
//
// 
//
// 说明： 
//
// 
// 输出结果中的每个元素一定是唯一的。 
// 我们可以不考虑输出结果的顺序。 
// 
// Related Topics 数组 哈希表 双指针 二分查找 排序 👍 477 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Solution solution = new IntersectionOfTwoArrays().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            //去重,比较池子
            HashSet<Integer> set = new HashSet<>();
            //存放结果
            List<Integer> list = new LinkedList<>();
            //先把一个放入比较池
            for (int i : nums1)
                set.add(i);
            //拿另一个比较
            for (int j : nums2) {
                //重复的元素并且结果集里没有
                if (set.contains(j) && !list.contains(j))
                    list.add(j);
            }
            int[] res = new int[list.size()];
            for (int i = 0; i < list.size(); i++)
                res[i] = list.get(i);
            return res;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}