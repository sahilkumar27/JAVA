package Java.src.com.LeetCodeDec;

import java.util.Scanner;

public class Q_1925_CountSquareSumTriples {
    public int countTriples(int n) {
        int count = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 1; c <= n; c++) {
                    if (a * a + b * b == c * c) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        Q_1925_CountSquareSumTriples obj = new Q_1925_CountSquareSumTriples();
        int result = obj.countTriples(n);

        System.out.println("Count of square sum triples = " + result);
    }
}

/*
Example 1:

Input: n = 5
Output: 2
Explanation: The square triples are (3,4,5) and (4,3,5).


Approach:
// (3,4,5) -> 3*3 + 4*4 = 9 + 16 = 25 = 5*5 --> valid triple
// (4,3,5) -> 4*4 + 3*3 = 16 + 9 = 25 = 5*5 --> valid triple
// answer = 2;

* */