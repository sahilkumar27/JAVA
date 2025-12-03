package Java.src.com.JavaCollection.List.ArrayList;

import java.util.List;

public class StringVsStream {
    public static void main(String[] args) {
        String sentence = "Hello Java";
        String upper = sentence.toUpperCase();
        System.out.println(upper);

        // String example
        List<String> fruits = List.of("apple", "banana", "avocado", "mango", "apricot");
        fruits.stream()
                .filter(f -> f.startsWith("a"))
                .forEach(System.out::println);
//                .map(String::toUpperCase)
//                .forEach(System.out::println);
//                .collect(Collectors.toList());
//                .forEach(System.out::println);
    }
}
