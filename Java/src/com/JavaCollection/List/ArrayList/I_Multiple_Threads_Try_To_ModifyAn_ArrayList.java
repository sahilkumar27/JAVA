package Java.src.com.JavaCollection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class I_Multiple_Threads_Try_To_ModifyAn_ArrayList {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> unsafeArrayList = new ArrayList<>();
        unsafeArrayList.add(1);
        unsafeArrayList.add(2);
        unsafeArrayList.add(3);

        // Create a thread pool of size 10
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // Create a Runnable task that increments each element of the ArrayList by one
        Runnable task = () -> {
            incremenmtArrayList(unsafeArrayList);
        };

        // Submit the task to the executor service 100 times.
        // All the tasks will modify the ArrayList concurrently.
        for (int i = 0; i < 100; i++) {
            executorService.submit(task);
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println(unsafeArrayList);
    }

    // Increment all the value in the ArrayList by one
    private static void incremenmtArrayList(List<Integer> unsafeArrayList) {
        for (int i = 0; i < unsafeArrayList.size(); i++) {
            Integer value = unsafeArrayList.get(i);
            unsafeArrayList.set(i, value + 1);
        }
    }
}


/**
    The ArrayList class is not synchronized. If multiple threads try to modify an ArrayList at the same time then the final result becomes not-deterministic because one
    thread might override the changes done by another thread.


 */
