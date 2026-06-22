package com.StriverA2Zsheet.Array;

public class SecondSamllestAndLargestElement {

    public static int SecondSmallestElement(int[] arr, int n) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            // checking duplicate smallest number [1,2,2,2,3,4,5]
            else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        return smallest;
    }

    public static int SecondLargestElement(int[] arr, int n) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int n1 = arr1.length;
        System.out.println("Second Smallest element in the array is: " + SecondSmallestElement(arr1, n1));

        int[] arr2 = {1, 2, 4, 7, 7, 5};
        int n2 = arr2.length;
        System.out.println("Second Largest element in the array is: " + SecondLargestElement(arr2, n2));
    }
}
