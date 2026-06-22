package Java.src.com.conditionalsAndloops.Questions;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {

// Q: find the nth fibonacci number, suppose 0,1,1,2,3,,5,8,13,......
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();    // nth fibonacci number
        int a = 0;      // previous number
        int b = 1;      // current number
        int count = 2;

        while (count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}

/*
a   b
0   1
1   1
1   2
2   3
3   5


*/