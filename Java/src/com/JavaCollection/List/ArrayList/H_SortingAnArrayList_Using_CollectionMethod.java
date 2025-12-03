package Java.src.com.JavaCollection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class H_SortingAnArrayList_Using_CollectionMethod {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(242);
        numbers.add(123);
        numbers.add(345);
        numbers.add(456);
        numbers.add(11);
        numbers.add(0);

        System.out.println("Before " + numbers);

        // Sorting an ArrayList with Collection.sort() methods
        Collections.sort(numbers);

        System.out.println("After " + numbers);
    }
}
