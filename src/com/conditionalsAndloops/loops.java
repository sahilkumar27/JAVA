package Java.src.com.conditionalsAndloops;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        /*
        -  Syntax of for loops:

        for (initialisation; condition; increment/decrement){
             // body
             }
        */

        // Q: Print numbers from 1 to 5
//        for (int num = 1;  num<=5; num+=2){
//            System.out.println(num);
//        }

        // print numbers from 1 to n
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int num = 1;  num <= n; num++){
////            System.out.println(num + " ");
//            System.out.println("Hello World");
//        }

        // while loops
        /*
          Syntax:
          while (condition){
                // body
           }
        */


//  Note: when to use for loop and while loop --> you need to run a while loop when you don't know how many times the loop is going to run and
//  use of for loop when you know how many times the loop is going to run if the question is like print the first 10 numbers then you will use a for loop if the question is something like keep taking input from a user till user does not press x here do you know how many times the loop will run, no depends on the user till the user will not press an x that many times of amount like the loop will be running so in that case use a while loop

        int num = 1;
        while (num <= 5){
            System.out.println(num);
            num += 1;
        }

        // do while
        /*
            do {
                   // body
            } while (condition);
        */

//  while loop vs do while loop
//  In the do while loop the program is going to execute the loop is going to execute at least once
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while(n <= 5);


    }
}
