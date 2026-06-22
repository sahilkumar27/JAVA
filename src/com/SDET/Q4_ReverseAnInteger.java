package Java.src.com.SDET;

public class Q4_ReverseAnInteger {
    // How do you reverse an integer in Java?
    public static void main(String[] args) {
        int num = 12345;
        int reverseNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reverse Number is: " + reverseNum);
    }
}
