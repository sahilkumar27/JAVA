package com.StriverA2Zsheet.Array;

public class MaximumConsecutiveOneInArray {

    public int CountMaximumConsecutiveOneInTheArray(int[] arr) {
        int count = 0;
        int maxi = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            maxi = Math.max(maxi, count);
        }

        return maxi;

    }


    public static void main(String[] args) {
        MaximumConsecutiveOneInArray obj = new MaximumConsecutiveOneInArray();
        int[] arr = {1, 1, 0, 1, 1, 1};
        int result = obj.CountMaximumConsecutiveOneInTheArray(arr);

        System.out.println(result);
    }
}
