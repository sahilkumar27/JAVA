package Java.src.com.SDET;

import java.util.Arrays;

public class Q8_CheckForAnagrams {
    // How do you check if two strings are anagrams?
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            System.out.println("The strings are anagrams");
        }
        else {
            System.out.println("The strings are not anagrams");
        }
    }
}


// str1.toCharArray() -> converts a String into an array of characters (char[]).