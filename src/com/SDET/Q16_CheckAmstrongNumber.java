package Java.src.com.SDET;

public class Q16_CheckAmstrongNumber {
    // How do you check if a number is an Amstrong number?
    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }
        if (originalNum == sum){
            System.out.println(originalNum + " is an Amstrong number.");
        }
        else {
            System.out.println(originalNum + " is not an Amstrong number.");
        }
    }
}


// (sum of each digit ^ number of digits) == original number