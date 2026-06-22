package Java.src.com.OOPs_Basic;

public class Person {
    //Fields to represent the attributes of a person
    private String name;
    private int age;

    //Constructor to initialize the fields
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Method to display the details of a person
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        //Creating an object of the Person class
        Person person = new Person("Sahil Kumar", 25);
        //Calling the displayDetails method
        person.displayDetails();
    }
}

/*
! Notes:
* 1.


* */
