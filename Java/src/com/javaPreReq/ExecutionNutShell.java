package Java.src.com.javaPreReq;

public class ExecutionNutShell {
     public static void main(String[] args) {
         byte numOne = 10;
         byte numTwo = 122;
         byte sumOfTwoNumbers = 0;
         sumOfTwoNumbers = (byte)(numOne + numTwo);
         System.out.println(sumOfTwoNumbers);
     }
}

/*
? We need to figure out why this happens. As you know, a byte is the smallest integer data type. You can assign a byte variable a range of integer values between (-128) to 127.
However, the byte has no literals or constants like int or long. It means you cannot assign an integer constant expression to a byte variable. Another possible explanation
that comes to my mind tells us that in Java, the int type is coded using 32 bits, while the byte type is coded using 8 bits. If you convert an int to a byte, there is a
chance that you may lose information. Yet we can do the same operations using the reference variables.

* In the above program, when we add two byte variables, it becomes an int literal expression. You cannot equate that with a byte variable anymore. We cannot convert int
constant to byte now.

*/