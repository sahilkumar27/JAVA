package Java.src.com.JavaCollection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//? Example demonstrating HashMap's unpredictable behavior in a multi-threaded environments.
public class G_SynchronizingAccess_I {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> crickenTeamScore = new HashMap<>();
        crickenTeamScore.put("India", 350);
        crickenTeamScore.put("Australia", 300);

        // Create an ExecutorService with a Thread Pool of size 10
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // Create a Runnable object that increment the value associated with a given key in the HashMap by one.
        Runnable task = () -> {
            incrementScore(crickenTeamScore, "India");
        };

        // Submit the runnable task to executorService 100 times to test concurrency modifications
        for (int i=0; i<100; i++) {
            executorService.submit(task);
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("Final Score: " + crickenTeamScore);

    }

    // Increment a score of a team by once
    private static void incrementScore(Map<String, Integer> crickenTeamScore, String team) {
        Integer score = crickenTeamScore.get(team);        // READ
        crickenTeamScore.put(team, score + 1);             // WRITE
    }
}

/*
Java HashMap is not thread-safe, it may become non-deterministic in multi-threads environments where multiple threads try to modify the HashMap concurrently. To ensure thread safety, you can use the synchronizedMap method from the Collections class to wrap a HashMap concurrently.

* */