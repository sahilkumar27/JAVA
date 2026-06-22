package Java.src.com.JavaCollection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

class Employee {
    private Integer id;
    private String name;
    private String department;

    public Employee(Integer id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setID(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{"
                + "id=" + id
                + ", name=" + name
                + ", department=" + department
                + "}";
    }

}


public class F_UserDefinedObject {
    public static void main(String[] args) {
        Map<Integer, Employee> mp = new HashMap<>();
        mp.put(101, new Employee(101, "Sahil", "IT"));
        mp.put(102, new Employee(102, "Sandeep", "HR"));
        mp.put(103, new Employee(103, "Harsh", "Finance"));

        System.out.println("Employee Map: " + mp);

    }
}
