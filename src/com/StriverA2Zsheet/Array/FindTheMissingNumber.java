package com.StriverA2Zsheet.Array;

public class FindTheMissingNumber {

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = (n+1) * (n+2) / 2;
        int arraySum = 0;
        for(int i=0; i<n; i++){
            arraySum += nums[i];
        }
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        FindTheMissingNumber findTheMissingNumber = new FindTheMissingNumber();
        int [] nums = {1, 2, 3, 5};
        int missingNumber = findMissingNumber(nums);
        System.out.println(missingNumber);
    }
}
