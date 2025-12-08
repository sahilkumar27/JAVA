package Java.src.com.SDET;

public class Q23_ReverseAnArray {
    // How do you reverse an array?
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "");
        }

        System.out.println("\nReversed array: ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + "");
        }
    }
}
