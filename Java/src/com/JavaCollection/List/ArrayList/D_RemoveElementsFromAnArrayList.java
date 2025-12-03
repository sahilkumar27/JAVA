package Java.src.com.JavaCollection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class D_RemoveElementsFromAnArrayList {

    public void RemoveElements(ArrayList<String> programmingLanguages){
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("PHP");
        programmingLanguages.add("GoLang");

        System.out.println("Initial ArrayList: " + programmingLanguages);

        programmingLanguages.remove(6);

        System.out.println("After REMOVE(\"PHP\"): " + programmingLanguages);

        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Swift");
        scriptingLanguages.add("Typescript");
        scriptingLanguages.add("Kotlin");

        System.out.println("Scripting Languages: " + scriptingLanguages);
        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After REMOVEALL(scriptingLanguages): " + programmingLanguages);

        // Remove all the elements that satisfy the given predicate
        programmingLanguages.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("C");
            }
        });

        /*
            The above removeIf() call can also be written using lambda expression like this -
            programmingLanguages.removeIf(s -> s.startsWith("C"))
        */

        System.out.println("After REMOVING all elements starting with \"C\":" + programmingLanguages);

        programmingLanguages.clear();
        System.out.println("After CLEAR(): " + programmingLanguages);
    }

    public static void main(String[] args) {
        ArrayList<String> programmingLanguages = new ArrayList<>();

        D_RemoveElementsFromAnArrayList removeElementsFromAnArrayList = new D_RemoveElementsFromAnArrayList();
        removeElementsFromAnArrayList.RemoveElements(programmingLanguages);
    }
}
