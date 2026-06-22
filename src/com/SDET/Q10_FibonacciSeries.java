package Java.src.com.SDET;

public class Q10_FibonacciSeries {
    // How do you generate the Fibonacci series up to a given number?
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        System.out.println("Fibonacci series: " + a + "," + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.println("," + c);
            a = b;
            b = c;
        }
    }
}
