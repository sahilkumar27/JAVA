package com.StriverA2Zsheet.String;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseWordInString {

    public String reverseWords(String s) {

        //List to store words
        List<String> words = new ArrayList<>();

        //StringBuilder to store the current/single word
        StringBuilder word = new StringBuilder();

        //Traverse each character int the string
        for (int i = 0; i < s.length(); i++) {
            //if it's not a space, add it to the current word
            if (s.charAt(i) != ' ') {
                word.append(s.charAt(i));
            }
            //if space a word is formed
            else if (word.length() > 0) {
                // Add word to list
                words.add(word.toString());

                // Reset StringBuilder for next word
                word.setLength(0);
            }
        }

        //Add the last word if present
        if (word.length() > 0) {
            words.add(word.toString());
        }

        //Reverse the list
        Collections.reverse(words);

        //Join the single space
        return String.join(" ", words);


    }

    public static void main(String[] args) {
        ReverseWordInString reverseWordInString = new ReverseWordInString();
        String s = "  Hello   World  ";
        String result = reverseWordInString.reverseWords(s);
        System.out.println("Reversed words in the string: " + result);
    }
}
