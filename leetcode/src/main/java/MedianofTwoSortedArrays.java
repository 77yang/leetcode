/**
 * @Author: yangqi
 * @Date: 12/12/2018 5:13 PM
 * <p>
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 * <p>
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * <p>
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * <p>
 * You may assume nums1 and nums2 cannot be both empty.
 * <p>
 * Example 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * The median is 2.0
 * Example 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * The median is (2 + 3)/2 = 2.5
 */
public class MedianofTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int len1 = nums1.length;
        int len2 = nums2.length;
        int i = 0, j = 0, k = 0;
        int[] arr = new int[len1 + len2];
        while (i < len1 || j < len2) {
            int i1 = nums1[i];
            int j1 = nums2[j];
            if (j1 >= i1) {
                arr[k++] = i1;
                i++;
            }else {
                arr[k++] = j1;
                j++;
            }

            }


        if (k % 2 == 0) {
            //奇数
            return arr[k / 2];

        } else {

        }


        return 0;
        }


    }
}
