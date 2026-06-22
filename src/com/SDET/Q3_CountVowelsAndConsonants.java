package Java.src.com.SDET;

public class Q3_CountVowelsAndConsonants {
    // How do you count the number of vowels and consonants in a string?
    public static void main(String[] args) {
        String str = "SAahil";
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

    }
}

// vowels = A,a,E,e,I,i,O,o,U, u
// consonants means jo vowels mein nhi ata
