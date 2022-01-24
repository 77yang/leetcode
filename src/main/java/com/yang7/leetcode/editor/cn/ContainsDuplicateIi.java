  //////////////给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j ，满足 nums[i] == 
//nums[
////j] 
//////且 
////////
//////////abs(
////////////i 
//////////////- j) <= k 。如果存在，返回 true ；否则，返回 false 。 
//////////////
////////////// 
//////////////
////////////// 示例 1： 
//////////////
////////////// 
//////////////输入：nums = [1,2,3,1], k = 3
//////////////输出：true 
//////////////
////////////// 示例 2： 
//////////////
////////////// 
//////////////输入：nums = [1,0,1,1], k = 1
//////////////输出：true 
//////////////
////////////// 示例 3： 
//////////////
////////////// 
//////////////输入：nums = [1,2,3,1,2,3], k = 2
//////////////输出：false 
//////////////
////////////// 
//////////////
////////////// 
//////////////
////////////// 提示： 
//////////////
////////////// 
////////////// 1 <= nums.length <= 10⁵ 
////////////// -10⁹ <= nums[i] <= 10⁹ 
////////////// 0 <= k <= 10⁵ 
////////////// 
////////////// Related Topics 数组 哈希表 滑动窗口 👍 370 👎 0
////////////
//////////
////////
//////
////
//

  
  package com.yang7.leetcode.editor.cn;

  import java.util.HashSet;
  import java.util.Set;

  public class ContainsDuplicateIi{
      public static void main(String[] args) {
           Solution solution = new ContainsDuplicateIi().new Solution();
          System.out.println(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
          System.out.println(solution.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
      }


      /**
       * nums[i] == nums[j]
       * return i - j <=k
       */
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public boolean containsNearbyDuplicate1(int[] nums, int k) {
//
//        int length = nums.length;
//        if (length < 2) {
//            return false;
//        }
//
//        for (int i = 1; i <= k; i++) {
//            int p = 0;
//            while (p+i < length) {
//                if (nums[p] == nums[p+i]) {
//                    return true;
//                }
//                p++;
//            }
//        }
//
//        return false;
//
//    }

          public boolean containsNearbyDuplicate(int[] nums, int k) {

              int length = nums.length;
              Set s = new HashSet<Integer>();
              for (int i = 0; i < length; i++) {
                  if (s.contains(nums[i])) {
                      return true;
                  }

                  s.add(nums[i]);

                  if (s.size()>=k+1) {
                      s.remove(nums[i-k]);
                  }
              }

              return false;

          }
}
//leetcode submit region end(Prohibit modification and deletion)

  }