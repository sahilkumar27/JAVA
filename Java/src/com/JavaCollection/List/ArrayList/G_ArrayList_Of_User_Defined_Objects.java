package Java.src.com.JavaCollection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

class User {
    private String name;
    private int age;
    private double marks;

    public User(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks){
        this.marks = marks;
    }
}

public class G_ArrayList_Of_User_Defined_Objects {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Sahil", 21, 77.60));
        users.add(new User("Sandeep", 24, 9.40));
        users.add(new User("Harsh", 22, 85.33));

        users.forEach(user -> {
        System.out.println("Name : " + user.getName() + ", Age : " + user.getAge() + ", Marks : " + user.getMarks());
        });

    }
}

/*
 * ArrayList supports generics, you can create an ArrayList of any type. It can be of simple types like Integer, String, Double or complex types like an ArrayList of ArrayLists, or an ArrayLists of HashMaps or an
 * ArrayList of any user defined objects.

In the User class, the getName() and setName(String name) methods are part of the class's accessor and mutator methods, respectively:
getName(): This is an accessor method (also known as a getter) that returns the value of the private instance variable name of the User object.
setName(String name): This is a mutator method (also known as a setter) that allows you to set or update the value of the private instance variable name of the User object.

 * */
