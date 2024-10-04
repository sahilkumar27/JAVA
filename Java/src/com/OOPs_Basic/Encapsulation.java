package Java.src.com.OOPs_Basic;

public class Encapsulation {
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("Sahil Kumar");
        obj.setAge(25);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }

}


/*
 ! Plans

    * 1.Define the four main principles of Object-Oriented Programming (OOP) in Java.
    * 2.Provide a brief explanation of each principle.
    * 3.Provide code examples to demonstrate each principle.



! Explanation
? 1. Encapsulation: Encapsulation is the mechanism of wrapping the data (variables) and code (methods) together as a single unit. It restricts direct access to some of an object's components, which can prevent the accidental modification of data.
? 2. Inheritance: Inheritance is a mechanism wherein a new class is derived from an existing class. The new class (child class) inherits the attributes and methods of the existing class (parent class).
? 3. Polymorphism: Polymorphism allows methods to do different things based on the object it is acting upon. It can be achieved through method overloading and method overriding.
? 4. Abstraction: Abstraction is the concept of hiding the complex implementation details and showing only the essential features of the object.


 */