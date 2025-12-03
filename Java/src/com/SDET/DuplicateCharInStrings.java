package Java.src.com.SDET;

import java.util.Scanner;

public class DuplicateCharInStrings {

    public static void duplicateString(String str) {
        str = str.toLowerCase();
        char[] chars = str.toCharArray();
        System.out.println("Duplicate character are: ");

        // Loop through each character in the string
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '0') {        // Skip spaces
                continue;
            }

            int count = 1;

            // Compare this character with all next characters
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = '0';     // Mark as visited
                }
            }

            // If character appears more than once, print it
            if (count > 1) {
                System.out.print(chars[i] + " --> " + count + " times\n");
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        duplicateString(input);
        scanner.close();
    }
}
