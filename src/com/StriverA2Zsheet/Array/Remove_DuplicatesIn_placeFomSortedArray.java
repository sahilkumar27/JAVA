package com.StriverA2Zsheet.Array;

import java.util.HashSet;

public class Remove_DuplicatesIn_placeFomSortedArray {

    public int removeDuplicates(int[] nums) {

//        // Using HashSet to store unique elements
//        HashSet<Integer> s = new HashSet<>();
//        int index = 0;
//        for (int num : nums) {
//            if (!s.contains(num)) {
//                s.add(num);
//
//                nums[index] = num;
//                index++;
//            }
//        }
//        return index;


        // Two-pointer approach
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 3, 4, 4, 9};
        Remove_DuplicatesIn_placeFomSortedArray sol = new Remove_DuplicatesIn_placeFomSortedArray();

        int x = sol.removeDuplicates(nums);
        System.out.println("Length of the array after removing duplicates: " + x + " ============ ");

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < x; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
