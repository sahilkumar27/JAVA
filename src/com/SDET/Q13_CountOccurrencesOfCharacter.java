package Java.src.com.SDET;

public class Q13_CountOccurrencesOfCharacter {
    // How do you count the occurrences of a given character in a string
    public static void main(String[] args) {
        String str = "Automation";
        char ch = 't';
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("The character " + ch + " appears " + count + " times.");
    }
}
