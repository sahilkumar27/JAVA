package com.StriverA2Zsheet.Array;

public class LeftRotateArrayByK {

    public void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public int[] rotateArray(int[] nums, int k, String direction) {
        int n = nums.length;

        if (n == 0 || k == 0) return nums;

        // normalize k if greater than n
        k = k % n;

        if(direction.equals("right")) {
            reverseArray(nums, 0, n - 1);   // reverse entire array
            reverseArray(nums, 0, k - 1);   // reverse first k elements
            reverseArray(nums, k, n - 1);   // reverse n-l elements
        }

        else if(direction.equals("left")) {
            reverseArray(nums, 0, k - 1);
            reverseArray(nums, k, n - 1);
            reverseArray(nums, 0, n - 1);
        }

        return nums;
    }

    public static void main(String[] args) {
        LeftRotateArrayByK leftRotateArrayByK = new LeftRotateArrayByK();
        int [] nums = {1,2,3,4,5,6};
        int k = 2;
        String direction = "left";

        int [] ans = leftRotateArrayByK.rotateArray(nums, k, direction);
        System.out.print("Array after rotating " + direction + " by " + k + ": ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
