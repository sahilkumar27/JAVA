package Java.src.com.JavaCollection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C_AccessingElementsFromAnArrayList {
    public static void main(String[] args) {

        List<String> topCompanies = new ArrayList<>();
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Microsoft");
        topCompanies.add("Apple");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        System.out.println("Here are the top " + topCompanies.size() + " companies in the world:");
        System.out.println(topCompanies);

        // Retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        String secondCompany = topCompanies.get(1);
        System.out.println(topCompanies.size());

        String LastCompany = String.valueOf(topCompanies.size());
        System.out.println(LastCompany.length());

        System.out.println("The best company is: " + bestCompany);
        System.out.println(LastCompany);

        topCompanies.set(4, "Walmart");
        System.out.println("Added new companies in the list " + topCompanies);

    }
}

/*

This example shows:
* How to check if an ArrayList is empty using the isEmpty() method.
* How to find the size of an ArrayList using the size() method.
* How to access the element at a particular index in an ArrayList using the get() method.
* How to modify the element at a particular index in an ArrayList using the set() method.

* */