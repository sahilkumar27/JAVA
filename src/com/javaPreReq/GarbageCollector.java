package Java.src.com.javaPreReq;

class Harshad {
    String name;
}

public class GarbageCollector {
    public static void main(String[] args) {
        Harshad h = new Harshad();
        h = null;
        System.gc();
    }
}


/*
* Garbage Collection Request: The System.gc() method is called to suggest that the Java Virtual Machine (JVM) performs garbage collection. Note that this is just
*                              a request, and the JVM may choose to ignore it.

* */