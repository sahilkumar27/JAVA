package Java.src.com.OOPs_Basic;

abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.draw();
    }
}
