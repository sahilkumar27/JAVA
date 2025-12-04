package Java.src.com.SDET;

import java.util.Arrays;

public class Q9_SecondLargestNumberInArray {
    // How do you find the second largest number in an array?
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 3, 9, 7};
        Arrays.sort(arr);
        System.out.println("The second largest number is: " + arr[arr.length - 2]);
    }
}
