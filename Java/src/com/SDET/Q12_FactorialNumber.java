package Java.src.com.SDET;

public class Q12_FactorialNumber {
    // How do you find the factorial of a number?
    public static void main(String[] args) {
        int num = 5;
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            System.out.println("1 * " + i);
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
