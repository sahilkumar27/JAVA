package Java.src.com.SwitchStatements;

import java.util.Scanner;

public class Display_Day_Name_bw_1_7 {
    public static void main(String[] args) {
        System.out.print("Enter your days to search: ");
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Enter valid Day");
//                break;
//        }


//  Program 3: Weekdays and Weekends
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekends :)");
                break;
            default:
                System.out.println("Enter valid data to search");
        }
    }
}
