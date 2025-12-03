package Java.src.com.JavaCollection.List.LinkedList;

import java.util.LinkedList;

public class B_Retrieving_Elements_fromA_LinkedList {
    public static void main(String[] args) {
        LinkedList<Double> stockPrices = new LinkedList<>();
        stockPrices.add(21.00);
        stockPrices.add(62.25);
        stockPrices.add(82.32);
        stockPrices.add(55.62);
        stockPrices.add(36.32);
        stockPrices.add(66.66);

        // Getting the first elements in the LL using getFirst() method
        // The getFirst() method throws NoSuchElementException if the LL is empty
        Double firstElement = stockPrices.getFirst();
        System.out.println(firstElement);

        // Getting the last elements in the LL using getLast() method
        // The getLast() method throws NoSuchElementException if the LL is empty
        Double lastElement = stockPrices.getLast();
        System.out.println(lastElement);

        // Getting the element at a specific index using get() method
        Double stockerPriceOn3rdDay = stockPrices.get(2);
        System.out.println(stockerPriceOn3rdDay);


    }
}
