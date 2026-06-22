package Java.src.com.conditionalsAndloops;

import java.util.Scanner;

public class TypeCasting {
//    Type version and Type Casting
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num2 = input.nextInt();
//        System.out.println(num2);

//        type casting [it means, compressing the bigger number in a smaller type explicitly]
//        int num = (int)(67.56f);
//        System.out.println(num);

////        automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) a;  // 257 % 256 = 1
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) /c ;
//        System.out.println(d);


//        Note: Java can follow unicode principles, means it can print any languages
        int number = 'A';
        System.out.println("こんにちは");

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);

    }
}
