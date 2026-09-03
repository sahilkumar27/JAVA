package com.StriverA2Zsheet.String;

public class LargestOddNumberInAString {


    public String largestOddNumber(String s) {
        int idx = -1;

        //Find the last odd digit in the string
        int i;
        for (i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) % 2 != 0) {
                idx = i;
                break;
            }
        }


        //Return empty string if no odd number is found
        if (idx == -1) return "";

        //Skip leading zeros up to the odd digit
        i = 0;
        while (i <= idx && s.charAt(i) == '0') {
            i++;
        }

        //Return the substring from first non-zero to odd digit
        return s.substring(i, idx + 1);

    }

    public static void main(String[] args) {
        LargestOddNumberInAString largestOddNumberInAString = new LargestOddNumberInAString();
        String s = "5347";
        String result = largestOddNumberInAString.largestOddNumber(s);
        System.out.println("Largest odd number in the string is: " + result);
    }
}
