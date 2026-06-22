package Java.src.com.SDET;

public class Q11_PrimeNumber {
    // How do you check if the number is prime?
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

// Start from 2 → go till √n → if anything divides n → not prime → otherwise prime.
// A number is prime if no smaller number up to its square root divides it.
