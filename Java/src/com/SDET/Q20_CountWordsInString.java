package Java.src.com.SDET;

public class Q20_CountWordsInString {
    // How do you count the number of words in a string?
    public static void main(String[] args) {
        String str = "SahilKumar";
        String[] words = str.split("\\s+");
        System.out.println(words.length);
    }
}
/*

\\s+ means:
\\ → escape character (needed in Java)
\s → whitespace (space, tab, newline)
+ → one or more spaces
So the string splits wherever there is one or more spaces.

* */