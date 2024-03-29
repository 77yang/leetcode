  //给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。 
//
// 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。 
//
// 以数组形式返回答案。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [8,1,2,2,3]
//输出：[4,0,1,1,3]
//解释： 
//对于 nums[0]=8 存在四个比它小的数字：（1，2，2 和 3）。 
//对于 nums[1]=1 不存在比它小的数字。
//对于 nums[2]=2 存在一个比它小的数字：（1）。 
//对于 nums[3]=2 存在一个比它小的数字：（1）。 
//对于 nums[4]=3 存在三个比它小的数字：（1，2 和 2）。
// 
//
// 示例 2： 
//
// 输入：nums = [6,5,4,8]
//输出：[2,1,0,3]
// 
//
// 示例 3： 
//
// 输入：nums = [7,7,7,7]
//输出：[0,0,0,0]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 500 
// 0 <= nums[i] <= 100 
// 
// Related Topics 数组 哈希表 计数 排序 👍 196 👎 0

  
  package com.yang7.leetcode.editor.cn;

  import java.util.*;

  public class HowManyNumbersAreSmallerThanTheCurrentNumber{
      public static void main(String[] args) {
           Solution solution = new HowManyNumbersAreSmallerThanTheCurrentNumber().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
          public int[] smallerNumbersThanCurrent(int[] nums) { // 8, 1, 2, 2, 3
              int len = nums.length;
              Map<Integer, Set<Integer>> valueIndex = new HashMap(len); // 预存每个值与索引对应
              for (int i = 0; i < len; i++) {
                  if (!valueIndex.containsKey(nums[i])) valueIndex.put(nums[i], new HashSet<>());
                  valueIndex.get(nums[i]).add(i);
              }
              int[] sortedArr = Arrays.copyOf(nums, len), res = new int[len];
              Arrays.sort(sortedArr); // 1, 2, 2, 3, 8
              for (int si = len - 1; si >= 0; si--) { // 倒序，方便处理同值的情况
                  // 此行为补充优化：前面还有同值的，那就跳过这次，等下次再一并赋值
                  if (si - 1 >= 0 && sortedArr[si] == sortedArr[si - 1]) continue;

                  for (int i : valueIndex.get(sortedArr[si])) res[i] = si; // 同值的所有索引都更新
              }
              return res;
          }

}
//leetcode submit region end(Prohibit modification and deletion)

  }