package Java.src.com.JavaCollection.List.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class D_Searching_For_Elements_InA_LL {
    public static void main(String[] args) {
        LinkedList <String> employees = new LinkedList<>();
        employees.add("Sahil");
        employees.add("Sandeep");
        employees.add("Harsh");
        employees.add("Maria");
        employees.add("Steve");
        employees.add("BOB");

        // Check if the Linkedlist contains an element
        System.out.println("Does the employee list contain \"BOB\"? : " + employees.contains("BOB"));

        // Find the index of the first occurrence of an element in a LinkedList
        System.out.println("Index of \"Sandeep\": " + employees.indexOf("Sandeep"));
        System.out.println("Index of \"Harsh\": " + employees.indexOf("Harsh"));

        // Fnind the index of the last occurrence of an element in a LinkedList
        System.out.println("Last index of \"Sahil\": " + employees.lastIndexOf("Maria"));
        System.out.println("Last index of \"Sakshi\": " + employees.lastIndexOf("Sakshi"));

    }
}
