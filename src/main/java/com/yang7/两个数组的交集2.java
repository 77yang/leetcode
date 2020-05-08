package com.yang7;

import java.util.Arrays;
import java.util.HashMap;

public class 两个数组的交集2 {
  static   class Solution {
      public int[] intersect(int[] nums1, int[] nums2) {
          if (nums1.length > nums2.length) {
              return intersect(nums2, nums1);
          }
          HashMap<Integer, Integer> m = new HashMap<>();
          for (int n : nums1) {
              m.put(n, m.getOrDefault(n, 0) + 1);
          }
          int k = 0;
          for (int n : nums2) {
              int cnt = m.getOrDefault(n, 0);
              if (cnt > 0) {
                  nums1[k++] = n;
                  m.put(n, cnt - 1);
              }
          }
          return Arrays.copyOfRange(nums1, 0, k);
      }

      public static void main(String[] args) {
          int[] nums1 = {4, 9, 5, 4, 4};
          int[] nums2 = {4, 8, 5, 4, 3};
          int[] intersect = new Solution().intersect(nums1, nums2);
          System.out.println(intersect);
      }


    }
}
