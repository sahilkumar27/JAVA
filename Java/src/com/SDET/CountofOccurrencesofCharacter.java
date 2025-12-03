package Java.src.com.SDET;

import java.util.Scanner;

public class CountofOccurrencesofCharacter {

    public static int CountofOccurrences(String str, int target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(target)) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Enter a character to count occurrences: ");
        char targetChar = scanner.nextLine().charAt(0);

        int count = CountofOccurrences(input, targetChar);
        System.out.println("The character '" + targetChar + "' occurs " + count + " times in the string '" + input + "'.");

        scanner.close();

    }


}
