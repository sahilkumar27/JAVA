package Java.src.com.conditionalsAndloops.Questions;

import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {

// n = 1,3,8,3,9  -->  ans = 2, so here I am pointing 3 as a counting occurences
        int n = 13839;
        int count = 0;

        while (n > 0){
            int reminder = n % 10;
            if (reminder == 3){
                count++;
            }
            n = n / 10;     // n /= 10  (remove the last digit)
        }

        System.out.println(count);
    }
}
