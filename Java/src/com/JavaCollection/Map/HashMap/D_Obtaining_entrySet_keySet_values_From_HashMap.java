package Java.src.com.JavaCollection.Map.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D_Obtaining_entrySet_keySet_values_From_HashMap {
    public static void main(String[] args) {
        Map<String, String> mp = new HashMap<>();
        mp.put("India", "IN");
        mp.put("United States", "US");
        mp.put("Canada", "CA");
        mp.put("United Kingdom", "UK");
        mp.put("Australia", "AU");
        mp.put("Germany", "DE");
        mp.put("France", "FR");
        mp.put("Japan", "JP");

        // HashMap's entry set()
        Set<Map.Entry<String, String>> countryISOCodeEntries = mp.entrySet();
        System.out.println("Country-ISO Code Entries : " + countryISOCodeEntries);

        // HashMap's keySet()
        Set<String> countryNames = mp.keySet();
        System.out.println("Country Names : " + countryNames);

        // HashMap's values()
        Collection<String> isCodes = mp.values();
        System.out.println("ISO Codes : " + isCodes);
    }
}
