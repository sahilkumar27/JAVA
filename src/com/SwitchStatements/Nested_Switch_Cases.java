package Java.src.com.SwitchStatements;

import java.util.Scanner;

public class Nested_Switch_Cases {
    public static void main(String[] args) {
        System.out.print("Enter your Case: ");
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String department = in.next();

        //better way to write
        switch (empID) {
            case 1 -> System.out.println("Sahil Kumar");
            case 2 -> System.out.println("Sandeep Kumar");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department Entered");
                }
            }
            default -> System.out.println("Enter correct empID");
        }
    }
}
