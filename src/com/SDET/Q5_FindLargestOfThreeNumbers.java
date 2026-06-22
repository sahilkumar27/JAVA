package Java.src.com.SDET;

public class Q5_FindLargestOfThreeNumbers {
    // How do you find the largest of three numbers?
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;
        if (a >= b && a >= c) {
            System.out.println("Largest Number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest Number is: " + b);
        } else {
            System.out.println("Largest Number is: " + c);
        }
    }
}
