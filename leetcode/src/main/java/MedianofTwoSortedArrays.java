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
//1 3   2 4 3


        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] arr = new int[l1 + l2];
        int k = 0, i = 0, j = 0;


        while (i < l1 || j < l2) {
            if (i < l1 && j >= l2) {
                arr[k++] = nums1[i++];
            } else if (i >= l1 && j < l2) {
                arr[k++] = nums2[j++];
            } else {
                int i1 = nums1[i];
                int i2 = nums2[j];
                if (i1 > i2) {
                    arr[k++] = i2;
                    j++;
                } else {
                    arr[k++] = i1;
                    i++;
                }
            }
        }


        k--;
        int index = k / 2;
        if (k % 2 == 0) {
            //奇数
            return arr[index];

        } else {
            return (arr[index] + arr[index + 1]) / 2.0;
        }


    }

    public static void main(String[] args) {

        double v = new MedianofTwoSortedArrays().findMedianSortedArrays(new int[]{1, 2, 3}, new int[]{3, 4});
        System.out.println(v);
    }
}
