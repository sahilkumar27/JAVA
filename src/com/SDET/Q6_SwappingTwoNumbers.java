package Java.src.com.SDET;

public class Q6_SwappingTwoNumbers {
    // Question: How do you swap two numbers without using a third variable ?
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
    }
}
