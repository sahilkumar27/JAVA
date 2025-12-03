package Java.src.com.LeetCodeDec;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest element: " + second);
        }
    }
}
