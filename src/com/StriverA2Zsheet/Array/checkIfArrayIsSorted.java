package com.StriverA2Zsheet.Array;

public class checkIfArrayIsSorted {

    public static boolean isSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {      // if any element is smaller than the previous one, then return false
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int n = arr.length;
        System.out.println("Is the array sorted? " + isSorted(arr, n));

    }
}
