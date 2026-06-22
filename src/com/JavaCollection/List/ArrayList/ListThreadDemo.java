package Java.src.com.JavaCollection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListThreadDemo {
    public static void testListConcurrency(List<Integer> list) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        long startTime = System.currentTimeMillis();

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        long endTime = System.currentTimeMillis();

        System.out.println("Final size: " + list.size());
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Testing with ArrayList (not thread-safe):");
        testListConcurrency(new ArrayList<>());

        System.out.println("\nTesting with Vector (thread-safe):");
        testListConcurrency(new Vector<>());
    }
}
