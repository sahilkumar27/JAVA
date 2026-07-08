package com.StriverA2Zsheet.Array;

import java.util.Arrays;

public class MergeSorted {

    public void merge(int [] nums1, int m, int [] nums2, int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else {
                nums1[k--] = nums2[j--];
            }
        }

        while(j>=0){
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {

        MergeSorted mergeSorted = new MergeSorted();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        mergeSorted.merge(nums1, 3, nums2, 3);

        System.out.println(Arrays.toString(nums1));

        //because arrays also inherit Object's default toString().
        //That's why Arrays.toString(nums1) is the standard way to print an array.
    }
}
