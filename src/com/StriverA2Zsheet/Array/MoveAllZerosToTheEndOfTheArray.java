package com.StriverA2Zsheet.Array;

public class MoveAllZerosToTheEndOfTheArray {
    public void moveZeros(int[] nums) {
        int n = nums.length;
        int j = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // Edge Case, if Zeros is not present in the array
        if (j == -1) return;

        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }

        }
    }

    public static void main(String[] args) {
        MoveAllZerosToTheEndOfTheArray moveAllZerosToTheEndOfTheArray = new MoveAllZerosToTheEndOfTheArray();
        int[] nums = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        moveAllZerosToTheEndOfTheArray.moveZeros(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
