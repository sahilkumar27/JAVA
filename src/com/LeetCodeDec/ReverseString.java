package Java.src.com.LeetCodeDec;

public class ReverseString {

    public void ReverseString() {
        String s = "SAHIL";
        char[ ] ch = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while(start <= end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        System.out.println(ch);
    }

    public void  ReverString2()
    {
        String s = "Sahil Kumar";
        String reverse = new StringBuilder(s).reverse().toString();
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        obj.ReverseString();
        obj.ReverString2();



    }

}
