package Java.src.com.DSA.SortingAlgorithm;

import java.util.Scanner;

public class BuubleSort {

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Array is not sorted");
                return false;
            }
        }
        return false;
    }

    public static void BubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read Size of an Array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create and fill the array
        int[] arr = new int[size];
        System.out.println("Enter elements inside the array : " + size);
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Check if the array is sorted
        if (isSorted(arr)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
            BubbleSort(arr);
        }

        // Print the sorted array
        System.out.println("Sorted array:");
        printArray(arr);

    }

}
