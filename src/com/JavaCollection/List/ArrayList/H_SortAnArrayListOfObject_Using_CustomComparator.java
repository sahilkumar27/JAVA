package Java.src.com.JavaCollection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{ name= " + name + ", age= " + age + "}";
    }
}

public class H_SortAnArrayListOfObject_Using_CustomComparator {
    public static void main(String[] args) {
//  declares a list named people that will store Person objects. This allows you to add multiple Person instances to the list and perform operations such as sorting, filtering, or iterating over the collection
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sshil", 21));
        people.add(new Person("Sandeep", 24));
        people.add(new Person("Harsh", 22));
        people.add(new Person("Rahul", 23));

        System.out.println("Person List: " + people);

        // Sort people by their Age
        people.sort((p1, p2) -> {
            return (p1.getAge() - p2.getAge());
        });

        // A more concise way wo writing the above sorting function
        people.sort(Comparator.comparingInt(Person::getAge)); //Person::getAge: This is a "method reference" to the getAge method of the Person class. It refers to the method getAge() that can be called on instances of the Person class.

        System.out.println("Sorted Person List by Age: " + people);

        // You can also sort using Collections.sort() method by passing the custom comparator
        Collections.sort(people, Comparator.comparing(Person::getName));
        System.out.println("Sorted Person List by Name: " + people);

    }
}
