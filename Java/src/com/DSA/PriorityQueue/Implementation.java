package Java.src.com.DSA.PriorityQueue;

import java.util.PriorityQueue;

public class Implementation {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(50);
        pq.add(1);
        System.out.println(pq.peek());
    }
}

