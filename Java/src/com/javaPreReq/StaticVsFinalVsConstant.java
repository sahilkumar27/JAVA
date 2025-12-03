package Java.src.com.javaPreReq;

import java.util.Scanner;

public class StaticVsFinalVsConstant {

    final  static String name = "Sahil";

    public   static  void  name1(){
        System.out.println("Your name is "+ name);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String  name = input.nextLine();
        System.out.println("Your name is "+ name);
    }

//    public void  name2(){
//        System.out.println("Your name is "+ name);
//    }
//
//    public void  name3(){
//        System.out.println("Your name is "+ name);
//    }
    public static void main(String[] args) {
        System.out.println("Your name is "+ name);
        name1();
//        StaticVsFinalVsConstant obj = new StaticVsFinalVsConstant();
//        obj.name2();
//        obj.name3();

    }



}


