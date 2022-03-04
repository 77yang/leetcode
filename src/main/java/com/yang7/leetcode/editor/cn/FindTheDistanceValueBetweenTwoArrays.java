//给你两个整数数组 arr1 ， arr2 和一个整数 d ，请你返回两个数组之间的 距离值 。
//
// 「距离值」 定义为符合此距离要求的元素数目：对于元素 arr1[i] ，不存在任何元素 arr2[j] 满足 |arr1[i]-arr2[j]| <= 
//d 。 
//
// 
//
// 示例 1： 
//
// 输入：arr1 = [4,5,8], arr2 = [10,9,1,8], d = 2
//输出：2
//解释：
//对于 arr1[0]=4 我们有：
//|4-10|=6 > d=2 
//|4-9|=5 > d=2 
//|4-1|=3 > d=2 
//|4-8|=4 > d=2 
//所以 arr1[0]=4 符合距离要求
//
//对于 arr1[1]=5 我们有：
//|5-10|=5 > d=2 
//|5-9|=4 > d=2 
//|5-1|=4 > d=2 
//|5-8|=3 > d=2
//所以 arr1[1]=5 也符合距离要求
//
//对于 arr1[2]=8 我们有：
//|8-10|=2 <= d=2
//|8-9|=1 <= d=2
//|8-1|=7 > d=2
//|8-8|=0 <= d=2
//存在距离小于等于 2 的情况，不符合距离要求 
//
//故而只有 arr1[0]=4 和 arr1[1]=5 两个符合距离要求，距离值为 2 
//
// 示例 2： 
//
// 输入：arr1 = [1,4,2,3], arr2 = [-4,-3,6,10,20,30], d = 3
//输出：2
// 
//
// 示例 3： 
//
// 输入：arr1 = [2,1,100,3], arr2 = [-5,-2,10,-3,7], d = 6
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr1.length, arr2.length <= 500 
// -10^3 <= arr1[i], arr2[j] <= 10^3 
// 0 <= d <= 100 
// 
// Related Topics 数组 双指针 二分查找 排序 👍 27 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.Arrays;

public class FindTheDistanceValueBetweenTwoArrays {
    public static void main(String[] args) {
        Solution solution = new FindTheDistanceValueBetweenTwoArrays().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
            Arrays.sort(arr2);
            int ans = 0;
            int n = arr2.length;
            for (int a : arr1) {
                int index1 = find1(arr2, a);
                if (0 <= index1 && index1 < n && Math.abs(a - arr2[index1]) <= d) continue; //已经不符合，跳过
                int index2 = find2(arr2, a);
                if (0 <= index2 && index2 < n && Math.abs(a - arr2[index2]) <= d) continue; //已经不符合，跳过
                ans++; //该值符合，ans加一
            }
            return ans;
        }

        int find1(int[] nums, int target) { //找大于等于target的下标
            int n = nums.length;
            int l = 0, r = n - 1;
            while (l <= r) {
                int mid = l + r >> 1;
                if (nums[mid] > target) r = mid - 1;
                else if (nums[mid] <= target) l = mid + 1;
            }
            return r >= 0 && nums[r] == target ? r : l;
        }

        int find2(int[] nums, int target) { //找小于等于target的下标
            int n = nums.length;
            int l = 0, r = nums.length - 1;
            while (l <= r) {
                int mid = l + r >> 1;
                if (nums[mid] >= target) r = mid - 1;
                else if (nums[mid] < target) l = mid + 1;
            }
            return l < n && nums[l] == target ? l : r;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}