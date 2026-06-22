package Java.src.com.JavaCollection.List.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class A_Implementation {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Tiger");
        animals.add("Lion");
        animals.add("Zebra");
        animals.add("Monkey");
        animals.add("Dog");
        animals.add("Cat");

        System.out.println(animals);

        // Adding an element at index 3
        animals.add(3, "Elephant");
        System.out.println(animals);

        // Adding an element at the beginning
        animals.addFirst("Goat");
        System.out.println(animals);

        // Adding an elements at the end of the LL (This method is equivalent to the add() method)
        animals.addLast("Deer");
        System.out.println(animals);

        // Adding all the elements from an existing collection to the end of the LL
        List<String> moreAnimals = new ArrayList<>();
        moreAnimals.add("Leopard");
        moreAnimals.add("Gorilla");
        moreAnimals.add("Snake");

        animals.addAll(moreAnimals);
        System.out.println(animals);



    }
}
