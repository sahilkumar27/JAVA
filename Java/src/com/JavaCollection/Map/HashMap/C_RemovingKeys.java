package Java.src.com.JavaCollection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class C_RemovingKeys {
    public static void main(String[] args) {
        Map<String, String> mp = new HashMap<>();
        mp.put("X", "Y");
        mp.put("P", "Q");
        mp.put("A", "B");

        System.out.println("Initial HashMap: " + mp);

        // Remove a key-value pair from the HashMap
        // Ex - Unfortunately, "P" has left the company, so we need to remove their entry
        String keyToRemove = "P";
        String removedValue = mp.remove(keyToRemove);

        System.out.println("Removed key: " + keyToRemove + ", Value: " + removedValue);
        System.out.println(mp);

        // Remove a key from the HashMap if it is mapped to a specific value
        // Ex - We want to remove "X" only if it is mapped to "Y"
        boolean isRemoved = mp.remove("X", "Y");
        System.out.println(isRemoved);


        // remove() returns null if the mapping was not found for the supplied key
        removedValue = mp.remove("Z");
        if (removedValue == null) {
            System.out.println("Key 'Z' not found in the HashMap.");
        } else {
            System.out.println("Removed key 'Z' with value: " + removedValue);
        }

    }
}
