package Java.src.com.SDET;

import java.util.Scanner;

public class ReomveCharInString {

    public static String removeChar(String str) {
        str = str.toLowerCase();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == ' ') {
                continue;
            }

            if (result.contains(String.valueOf(currentChar))) {
                continue;
            } else {
                result += String.valueOf(currentChar);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("After removing duplicate characters: " + removeChar(input));
        scanner.close();

    }
}






