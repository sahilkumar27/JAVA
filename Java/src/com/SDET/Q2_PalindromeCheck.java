package Java.src.com.SDET;

public class Q2_PalindromeCheck {
    // How do you check if a string is a palindrome?
    public static void main(String[] args) {
        String str = "madam";
        String reversedstr = "";
        for (int i=str.length()-1; i>=0; i--){
            reversedstr += str.charAt(i);
        }

        if(str.equals(reversedstr)){
            System.out.println(str + " is a Palindrome");
        }
        else{
            System.out.println(str + " not a Palindrome");
        }

    }
}
