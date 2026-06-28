package com.StriverA2Zsheet.Array;

public class MergeSortedArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;    // last element in nums1
        int j = n - 1;    // last element in nums2
        int k = m + n - 1;  // last position in nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }


    public static void main(String[] args) {
        int [] nums1 = {1,2,3,4,5 ,0,0,0,0,0};
        int [] nums2 = {6,7,8,9,10};
        merge(nums1, 5, nums2, 5);

        System.out.println("After merging the two sorted arrays, the result is: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
