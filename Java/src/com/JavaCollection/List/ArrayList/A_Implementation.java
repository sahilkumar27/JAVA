package Java.src.com.JavaCollection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;


public class A_Implementation {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Monkey");
        animals.add("Dog");

        System.out.println(animals);

        animals.add(2, "Elephant");

        System.out.println(animals);
    }
}
