  //给你一个整数数组 nums ，请你将数组按照每个值的频率 升序 排序。如果有多个值的频率相同，请你按照数值本身将它们 降序 排序。 
//
// 请你返回排序后的数组。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [1,1,2,2,2,3]
//输出：[3,1,1,2,2,2]
//解释：'3' 频率为 1，'1' 频率为 2，'2' 频率为 3 。
// 
//
// 示例 2： 
//
// 输入：nums = [2,3,1,3,2]
//输出：[1,3,3,2,2]
//解释：'2' 和 '3' 频率都为 2 ，所以它们之间按照数值本身降序排序。
// 
//
// 示例 3： 
//
// 输入：nums = [-1,1,-6,4,5,-6,1,4,1]
//输出：[5,-1,4,4,-6,-6,1,1,1] 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 100 
// -100 <= nums[i] <= 100 
// 
// Related Topics 数组 哈希表 排序 👍 39 👎 0

  
  package com.yang7.leetcode.editor.cn;

  import java.util.HashMap;
  import java.util.Map;
  import java.util.PriorityQueue;

  public class SortArrayByIncreasingFrequency{
      public static void main(String[] args) {
           Solution solution = new SortArrayByIncreasingFrequency().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
      class Solution {
          /**
           * 哈希表 + 优先队列
           */
          public int[] frequencySort(int[] nums) {
              Map<Integer, Integer> map = new HashMap<>();
              int length = nums.length;
              for (int i = 0; i < length; i++) {
                  map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
              }
              PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0]);
              for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                  queue.add(new int[]{entry.getValue(), entry.getKey()});
              }
              int[] ans = new int[length];
              int index = 0;
              while (!queue.isEmpty()){
                  int[] ele = queue.poll();
                  for (int i = 0; i < ele[0]; i++) {
                      ans[index++] = ele[1];
                  }
              }
              return ans;
          }
      }

//leetcode submit region end(Prohibit modification and deletion)

  }