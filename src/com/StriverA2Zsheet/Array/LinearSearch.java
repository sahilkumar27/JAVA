package com.StriverA2Zsheet.Array;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target, int n) {

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;   // return index
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int [] arr = {1,2,3,4,5};
        int target = 3;
        int n = arr.length;

        int index = linearSearch(arr, target, n);

        if(index != -1){
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }


    }
}
