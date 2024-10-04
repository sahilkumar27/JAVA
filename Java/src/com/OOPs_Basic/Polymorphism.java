package Java.src.com.OOPs_Basic;


// Method Overloading
class MathOperation {
    int add (int a, int b){
        return a + b;
    }

    double add (double a, double b){
        return a + b;
    }
}

class Animal{
    void sound(){
        System.out.println("Bhai Ache se padh le");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Haan Bhai Override ka mtlb samj aaya");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
//        Method Overloading
        MathOperation operation = new MathOperation();
        System.out.println("Sum of integers: " + operation.add(5, 3));
        System.out.println("Sum of doubles: " + operation.add(5.5, 3.3));

        //Method Overriding
        Animal myCat = new Cat();
        myCat.sound();
    }
}
