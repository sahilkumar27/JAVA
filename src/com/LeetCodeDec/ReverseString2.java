package Java.src.com.LeetCodeDec;

public class ReverseString2 {

    public static String reverseString(char[] s) {
        StringBuilder x = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
            x.append(s[i]);  // Append characters in reverse order
        }
        return x.toString();  // Convert StringBuilder to String
    }

    public static void main(String[] args) {
        // Example input
        char[] input = {'H', 'e', 'l', 'l', 'o'};

        // Call the reverseString method
        String reversed = reverseString(input);

        // Print the result
        System.out.println("Reversed String: " + reversed);
    }
}
