package Java.src.com.SDET;

public class Q22_FindFirstNon_RepeatedCharacter {
    // How do you find the first non-repeated character in a string?
    public static void main(String[] args) {
        String str = "Automation";
        for (char ch : str.toCharArray()) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeated character is: " + ch);
                break;
            }
        }
    }
}
