package Java.src.com.JavaCollection.List.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class C_Removing_Elements_From_A_LL {

    public static void RemoveElements(LinkedList<String> list, Scanner scanner) {
        System.out.print("Removing elements from a LinkedList : ");

        String elementToRemove = scanner.nextLine();
        boolean isRemoved = list.remove(elementToRemove);

        if (isRemoved) {
            System.out.println(elementToRemove);
        } else {
            System.out.println("Element not found in the list.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> programmingLanguages = new LinkedList<>();

        // Get the size of the LinkedList from the user
        System.out.println("Enter the number of elements you want to add to the LinkedList:");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Get elements from the user
        for (int i = 0; i < size; i++) {
            System.out.println("Eneter element " + i + 1);
            String input = scanner.nextLine();
            programmingLanguages.add(input);
        }

        System.out.println(programmingLanguages);

        // Call the method to remove elements
        RemoveElements(programmingLanguages, scanner);
        System.out.println("After removing elements: " + programmingLanguages);

        scanner.close();
    }
}
