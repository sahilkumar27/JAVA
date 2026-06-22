package Java.src.com.SDET;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Q14_RemoveDuplicateFromArray {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 3, 4, 5, 6, 6, 7};
        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println("Array with duplicate removed: " + set);
    }
}
