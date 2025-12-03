package Java.src.com.JavaCollection.Map.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class G_SynchronizingAccess_II {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> mp = Collections.synchronizedMap(new HashMap<>());
        mp.put("India", 250);
        mp.put("Australia", 349);

        // Create an ExecutorService with a Thread Pool of size 10
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // Create a Runnable object that increment the value associated with a given key in the HashMap by one.
        Runnable task = () -> {
            incrementTeamScore(mp, "India");
        };

        // Submit the runnable task to executorService 100 times to test concurrency modifications
        for (int i=0; i<100; i++){
            executorService.submit(task);
        }
        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("Final Score: " + mp);

    }

    // Increment a score of a team by once
    private static void incrementTeamScore(Map<String, Integer> mp, String team) {
        synchronized (mp) {
            Integer score = mp.get(team);        // READ
            mp.put(team, score + 1);             // WRITE
        }

    }
}

// Let's write the thread-safe version of the previous program. We can make the follow two changes tp the program to make it thread=sage-
// * User Collection.s.synchronizedMap method to obtain a synchronized view of the HashMap.
// * Write the increment logic inside a synchronized block to ensure that only one thread can modify the map at a time.