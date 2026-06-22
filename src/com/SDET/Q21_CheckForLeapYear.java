package Java.src.com.SDET;

public class Q21_CheckForLeapYear {
    // How do you check if a year is a leap year?
    public static void main(String[] args) {
        int year = 1900;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " not a leap year");
        }
    }
}
