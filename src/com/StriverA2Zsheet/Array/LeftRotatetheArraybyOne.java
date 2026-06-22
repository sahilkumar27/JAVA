package com.StriverA2Zsheet.Array;

public class LeftRotatetheArraybyOne {

    public static void solve(int[] arr) {
        int n = arr.length;

        int temp = arr[0];  // store the first element in a temporary variable

        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        // Place the first element at the end
        arr[arr.length - 1] = temp;

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


    public static void main(String[] args) {
        LeftRotatetheArraybyOne solution = new LeftRotatetheArraybyOne();
        int[] arr = {1, 2, 3, 4, 5};
        solution.solve(arr);

    }
}
