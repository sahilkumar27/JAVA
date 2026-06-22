package Java.src.com.JavaCollection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

import static java.sql.Types.NULL;

public class A_Implementation {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> mp = new HashMap<>();
        mp.put("A", 1);
        mp.put("B", 2);
        mp.put("C", 3);
        mp.put("E", 5);
        mp.put("F", NULL);

        // Add a key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        mp.putIfAbsent("D", 4);

        System.out.println(mp);

    }
}


/*
?   Java HashMap is a hash table based implementation of Java's Map interface. A Map, as you might know, is a collection of key-value pairs, it maps keys to values
    *  A HashMap cannot contain duplicate keys.
    * Java HashMap allows nul values and null key.
    * HashMap is an unordered collection. It does not guarantee any specific order of the elements.
    * Java HashMap is not thread-safe. You must explicitly synchronize concurrent modifications to the HashMap
*/
