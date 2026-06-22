package Java.src.com.JavaCollection.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class E_Iterating_Over_HashMap {
    public static void main(String[] args) {
        Map<String, Double> mp = new HashMap<>();
        mp.put("Sahil", 421000.0);
        mp.put("Harsh", 320000.0);
        mp.put("Sandeep", 250000.0);

        System.out.println("Iterating over a HashMap using Java 8 forEach and lambda: ");
        mp.forEach((key, value) -> {
            System.out.println(key + " => " + value);
        });

        System.out.println();

        System.out.println("Iterating over the HashMap's entrySet using iterator() : ");
        Set<Map.Entry<String, Double>> employeeSalariesEntries = mp.entrySet();
        Iterator<Map.Entry<String, Double>> employeeSalariesIterator = employeeSalariesEntries.iterator();
        while (employeeSalariesIterator.hasNext()) {
            Map.Entry<String, Double> entry = employeeSalariesIterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println();

        System.out.println("Iterating over the HashMap's entrySet using Java 8 forEach and lambda: ");
        mp.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        });

        System.out.println();

        System.out.println("Iterating over the HashMap's entrySet using simple for-each loop: ");
        for (Map.Entry<String, Double> entry : mp.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println();

        System.out.println("Iterating over the HashMap's keySet ");
        mp.keySet().forEach(employee -> {
            System.out.println(employee + " => " + mp.get(employee));
        });


    }
}
