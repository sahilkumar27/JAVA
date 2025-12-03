package Java.src.com.SDET;

import java.util.Scanner;

public class ReverseString {

    public static String reverse(String str){

        // Base Case
        if(str == null || str.isEmpty())
            return str;

        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = in.nextLine();
        System.out.println("The reversed string is: " + reverse(str));

    }

}
