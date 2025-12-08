package Java.src.com.SDET;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q24_MergeTwoArrays {
    // How do you merge two arrays?
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] mergedArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
        System.out.println("Merge Array: " + Arrays.toString(mergedArray));
    }
}

/*
Arrays.stream(arr1)

Converts first array into an IntStream.

Example:
arr1 = {1, 2, 3}
becomes stream: 1 2 3    === same for arr2 also
arr2= {4, 5, 6}
becomes stream: 4 5 6

concat = 1, 2, 3, 4, 5, 6

.toArray() --> Converts the merged stream back into an integer array.
mergedArray = {1, 2, 3, 4, 5, 6}


* */