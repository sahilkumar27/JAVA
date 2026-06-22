package Java.src.com.LeetCodeDec;
import java.util.Scanner;

public class Day3 {
    static class Solution {
        public String addSpaces(String s, int[] spaces) {
            StringBuilder result = new StringBuilder();
            int previousIndex = 0;
            for (int space : spaces) {
                result.append(s, previousIndex, space).append(' ');
                previousIndex = space;
            }
            result.append(s.substring(previousIndex));
            return result.toString();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Solution solution = new Solution();

            System.out.println("Enter the string:");
            String s = scanner.nextLine();

            System.out.println("Enter the number of spaces:");
            int n = scanner.nextInt();
            int[] spaces = new int[n];

            System.out.println("Enter the space positions:");
            for (int i = 0; i < n; i++) {
                spaces[i] = scanner.nextInt();
            }

            System.out.println("Output: " + solution.addSpaces(s, spaces));
        }
    }
}
