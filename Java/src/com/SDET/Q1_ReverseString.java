package Java.src.com.SDET;

public class Q1_ReverseString {
    // How do you reverse a given string in Java?
    public static void main(String[] args) {
        String str = "Automation";
        String reverstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverstr += str.charAt(i);
        }
        System.out.println("Reverse String is: " + reverstr);
    }
}
