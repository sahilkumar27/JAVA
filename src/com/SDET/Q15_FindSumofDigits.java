package Java.src.com.SDET;

public class Q15_FindSumofDigits {
    // How do you find the sum of digits of a number?
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("The sum of digit is: " + sum);
    }
}
