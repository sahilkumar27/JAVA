package Java.src.com.JavaCollection.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class E_Iterating_Over_A_LL {
    public static void main(String[] args) {
        LinkedList<String> products = new LinkedList<>();
        products.add("Laptop");
        products.add("Mobile");
        products.add("Tablet");
        products.add("Smart Watch");
        products.add("Headphones");
        products.add("Camera");

        System.out.println("=== Iterate over a LinkedList using java 8 forEach and lambda ===");
        products.forEach(name -> {
            System.out.println(name);
        });

        System.out.println("\n === Iterate over a LinkedList using iterator() ===");
        Iterator<String> productsIterator = products.iterator();
        while(productsIterator.hasNext()) {
            String productName = productsIterator.next();
            System.out.println(productName);
        }

        System.out.println("\n === Iterate over a LinkedList using iterator() and Java 8 forEachRemaining() method ===");
        productsIterator = products.iterator();
        productsIterator.forEachRemaining(name -> {
            System.out.println(name);
        });

        System.out.println("\n === Iterate over a LinkedList using descendingIterator() ===");
        Iterator<String> descendingProductIterator = products.descendingIterator();
        while(descendingProductIterator.hasNext()){
            String productNmae = descendingProductIterator.next();
            System.out.println(productNmae);
        }

        System.out.println("\n === Iterate over a LinkedList using listIterator() ===");
        // ListIterator can be used to iterate over a LinkedList in both forward and backward directions
        // In this example, we start from the end of the list and traverse backwards
        ListIterator<String> productListIterator = products.listIterator(products.size());
        while(productListIterator.hasPrevious()){
            String productName = productListIterator.previous();
            System.out.println(productName);
        }

        System.out.println("\n=== Iterate over a LinkedList using simple for-each loop ===");
        for (String product : products){
            System.out.println(product);
        }
    }
}
