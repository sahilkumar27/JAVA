package Java.src.com.javaPreReq;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
////        System.out.print("please enter some input: ");
////        int rollno = input.nextInt();
////        System.out.println("Your roll number is " + rollno);
//
//
////        int a = 999_000_000;
////        System.out.println(a);
//
////        String name = input.next();
////        System.out.println(name);
//
////        String name1 = input.nextLine();
////        System.out.println(name1);
//
//        float marks = input.nextFloat();
//        System.out.println(marks);

        System.out.println("Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Your Name is: " + name);

        System.out.println("Enter Your Address: ");
        Scanner input2 = new Scanner(System.in);
        String address = input2.nextLine();
        System.out.println("Your Address is: " + address);


    }
}
