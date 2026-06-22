package Java.src.com.DSA.SortingAlgorithm;

import java.util.Scanner;

public class MergeSort {

    public static void mergesort(int[] arr) {
        if (arr.length <= 1) {
            return; // Base case: if the array has one or no elements, it's already sorted
        }

        int n = arr.length;
        int mid = n / 2;

        // Create left and right subarrays
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        // Fill the left subarray
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        // Fill the right subarray
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }

        // Recursively sort the left and right subarrays
        mergesort(left);
        mergesort(right);
        // Merge the sorted subarrays back into the original array
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements inside the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergesort(arr);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
