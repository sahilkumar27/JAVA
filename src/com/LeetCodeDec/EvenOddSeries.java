package Java.src.com.LeetCodeDec;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = scanner.nextInt();

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
