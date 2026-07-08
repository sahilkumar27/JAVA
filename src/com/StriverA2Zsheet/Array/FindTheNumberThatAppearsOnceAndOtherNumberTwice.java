package com.StriverA2Zsheet.Array;

public class FindTheNumberThatAppearsOnceAndOtherNumberTwice {

    public int FindNumberThatAppearsOnceAndTwice(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;

            // Count how many times num occurs
            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }
            // If only once, return it
            if (count == 1) return num;
        }

        return -1;  // fallback, won't be hit if array has a single element

    }


    public static void main(String[] args) {
        FindTheNumberThatAppearsOnceAndOtherNumberTwice obj = new FindTheNumberThatAppearsOnceAndOtherNumberTwice();

        int[] arr = {4, 1, 2, 1, 2};
        int ans = obj.FindNumberThatAppearsOnceAndTwice(arr);

        System.out.println(ans);
    }
}
