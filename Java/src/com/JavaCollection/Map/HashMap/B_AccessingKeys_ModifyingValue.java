package Java.src.com.JavaCollection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class B_AccessingKeys_ModifyingValue {
    public static void main(String[] args) {
        Map<String, String> mp = new HashMap<>();

        // Check if the HashMap is empty
        System.out.println("Is the HashMap emty? " + mp.isEmpty());

        mp.put("Sahil", "Hyderabad");
        mp.put("Harsh", "Chandigarh");
        mp.put("Sandeep", "Pune");
        System.out.println(mp);

        // Find the size of the HashMap
        System.out.println("We have the city information of " + mp.size() + " of users");

        String username = "Sahil";

        // Check if a target key exists in the HashMap
        if (mp.containsKey(username)) {

            // Get the value assigned to a given target key in the HashMap
            String city = mp.get(username);
            System.out.println(username + " lives in " + city);
        } else {
            System.out.println("City details not found for user  " + username);
        }

        // Check if a value exists in a HashMap
        if (mp.containsValue("Pune")) {
            System.out.println("There is a user in the HashMap who lives in Pune");
        } else {
            System.out.println("There is no user in the HashMap who lives in Pune");
        }

        //! Modify the value associated with a key
        String newCity = "Delhi";
        if (mp.containsKey(username)) {
            mp.put(username, newCity);
            System.out.println("Updated " + username + "'s city to " + newCity);
        } else {
            System.out.println("User " + username + " not found in the HashMap");
        }

        // Thr get() method returns `null` if the specified key was not found in the HashMap
        System.out.println("Sakshi lives in : " + mp.get("Sakshi"));

    }
}

/*
Accessing keys and modifying their associated values in a HashMap
    * How to check if a HashMap is empty | isEmpty()
    * How to get the size of a HashMap | size()
    * How to check if a key exists in a HashMap | containsKey()
    * How to check if a value exists in a HashMap | containsValue()
    * How to get a value associated with a key | get()
    * How to modify the value associated with a key | put()
*/