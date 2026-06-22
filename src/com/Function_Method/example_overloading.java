package Java.src.com.Function_Method;

public class example_overloading
{
    // Method with two integer parameters
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of integers: " + sum);
    }

    // Method with three integer parameters
    public void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum of three integers: " + sum);
    }

    public static void main(String[] args) {
        example_overloading example = new example_overloading();

        // Calling the method with two integers
        example.add(10, 20);

        // Calling the method with three integers
        example.add(10, 20, 30);
    }
}

