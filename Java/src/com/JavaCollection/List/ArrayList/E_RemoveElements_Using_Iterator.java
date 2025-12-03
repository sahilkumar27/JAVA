package Java.src.com.JavaCollection.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class E_RemoveElements_Using_Iterator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(17);
        numbers.add(19);
        numbers.add(50);
        numbers.add(23);
        numbers.add(40);

        Iterator<Integer> numbersIterator = numbers.iterator();
        while(numbersIterator.hasNext()){
            Integer num = numbersIterator.next();
            if (num % 2 != 0){
                numbersIterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
