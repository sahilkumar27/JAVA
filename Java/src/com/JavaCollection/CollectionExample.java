package Java.src.com.JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(20);
        System.out.println(numbers);
        System.out.println(numbers);

        ArrayList<Integer> numberss = new ArrayList<>();
        numberss.add(1);
        numberss.add(1);
        numbers.add(30);
        System.out.println(numbers.size());
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 20) {
                numbers.remove(i);
                i--;
            }
        }
        System.out.println(numberss);
    }
}


//Notes:
/*
java.util.Collection is the root of the Java Collection framework and most of the collections in Java are inherited from this interface except Map Interface

-------------------
Synchronous: Think of a face-to-face conversation where you take turns speaking and listening. Each person must wait for the other to finish speaking before responding.
              In programming, synchronous operations happen one after another; the next operation waits for the previous one to complete.

Asynchronous: Compare this to sending an email. You can send an email, continue with other tasks, and later check for a reply instead of waiting for an immediate response.
              In programming, asynchronous operations allow tasks to execute independently without waiting for other tasks to finish.

* */