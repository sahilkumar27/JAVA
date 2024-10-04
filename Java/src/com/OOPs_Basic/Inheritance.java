package Java.src.com.OOPs_Basic;

public class Inheritance {
    // Parent class
    class Animal {
        public void eat() {
            System.out.println("Animal is eating");
        }
    }

    // Child class
    class Dog extends Animal {
        public void bark() {
            System.out.println("Dog is barking");
        }
    }

    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        Dog dog = obj.new Dog();
        dog.eat();
        dog.bark();
    }
}
