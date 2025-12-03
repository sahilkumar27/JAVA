package Java.src.com.SDET;

public class PalindromeNumber {

    public static boolean isPalindrome(int x){
        if (x < 0){
            return false;
        }

        int reversed = 0;
        int original = x;
        while(x > 0){
            int rem = x %10;
            reversed = reversed * 10 + rem;
            x = x / 10;
        }
        return original == reversed;
    }
}
