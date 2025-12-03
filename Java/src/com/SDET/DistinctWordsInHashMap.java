package Java.src.com.SDET;

import java.util.HashMap;
import java.util.Map;

public class DistinctWordsInHashMap {
    public static void main(String[] args) {
        String [] words = {"Sahil", "Kumar", "Sahil", "Kumar", "Sahil", "Kumar", "Sahil", "Kumar"};

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for(String word : words){
            wordCountMap.put(word, wordCountMap.getOrDefault(word,0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(wordCountMap);
        System.out.println(wordCountMap.keySet());
    }
}
