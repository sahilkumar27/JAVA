package com.sahil;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float num1 = input.nextFloat();
        int num2 = input.nextInt();

        float sum = num1 + num2;
        System.out.println("Sum of two number is: " + sum);
    }
}
