package Java.src.com.javaPreReq;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter temperature into celsius: ");
        float tempC = in.nextFloat();

        // FORMULA of Conversion of Cel to Fer
        float   tempF = (tempC * 9/5) + 32;

        System.out.println(tempF);
    }
}
