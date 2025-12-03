package Java.src.com.JavaCollection.List.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class H_SortAnArrayList_Using_ArrayListMethod {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Sahil");
        names.add("Harsh");
        names.add("Sandeep");
        names.add("Ananya");
        names.add("Munmun");
        names.add("Bob");

        System.out.println("Before Sorted Names " + names);

        // Sort an ArrayList using its sort() method. You must pass a Comparator to the ArrayList.sort() method.
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });

        // The above 'sort()' method call can also be written simply using lambda expression
        names.sort((name1, name2) -> name1.compareTo(name2));

        // Following is an even more concise solution
        names.sort(Comparator.naturalOrder());

        System.out.println("After Sorted Names " + names);

    }
}
