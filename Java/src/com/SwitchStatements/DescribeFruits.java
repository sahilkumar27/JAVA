package Java.src.com.SwitchStatements;

import java.util.Scanner;

public class DescribeFruits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch(fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            case "Watermellon":
                System.out.println("Juicy fruit");
                break;
            default:
                System.out.println("Please enter a valid fruits");
        }

    }
}

// debuger pointer - whenever you run this program and when u find the debug pointer it will stop there and execute code line by line

// In windows -> ctr + enter will beautify the code
// In linux/Mac -> alt + enter (move the cursor to switch word then press this command for beautification)