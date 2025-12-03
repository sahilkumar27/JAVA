package Java.src.com.JavaCollection.List.ArrayList;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3};
        boolean hasDuplicate = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element found: " + arr[i]);
                    hasDuplicate = true;
                }
            }
        }

        if (!hasDuplicate) {
            System.out.println("No duplicate elements found.");
        }
    }
}
