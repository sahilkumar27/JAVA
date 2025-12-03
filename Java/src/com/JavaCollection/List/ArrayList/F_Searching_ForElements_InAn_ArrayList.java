package Java.src.com.JavaCollection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class F_Searching_ForElements_InAn_ArrayList {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Sahil");
        names.add("BOB");
        names.add("Sandeep");
        names.add("Harsh");
        names.add("Maria");
        names.add("Steve");

        System.out.println("Does name array contains \"BOB\"? : " + names.contains("BOB"));

        // Find the index of first occurrence of an element in an ArrayList
        System.out.println("indexOf \"Sandeep\": " + names.indexOf("Sandeep"));
        System.out.println("indexOf \"Harsh\": " + names.indexOf("Harsh"));

        // Find the index of the last occurrence of an element in an ArrayList
        System.out.println("lastIndexOf \"Sahil\": " + names.lastIndexOf("Sahil"));
        System.out.println("lastIndexOf \"Sakshi\": " + names.lastIndexOf("Sakshi"));

    }
}
