package Java.src.com.conditionalsAndloops.Questions;

public class ReverseNumber {
    public static void main(String[] args) {

// Q: n = 2,3,5,9,7     ans = 7,9,5,3,2
        int n = 795932;
        int ans = 0;

        while (n > 0){
            int rem = n % 10;       // give the last digit
            n = n / 10;     // remove the last digit

            ans  = ans * 10 + rem;
        }

        System.out.println(ans);
    }
}
