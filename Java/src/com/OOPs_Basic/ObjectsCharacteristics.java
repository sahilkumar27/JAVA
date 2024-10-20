package Java.src.com.OOPs_Basic;

class AnotherCar {

    int speed = 0;
    int gear = 0;

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increasing) {
        speed = speed + increasing;
    }

    void speedDown(int reducing) {
        speed = speed - reducing;
    }

    void stopCar(int noSpeed){
        speed = speed * noSpeed;
    }

    void stateOfCar() {
        System.out.println(" The speed of car: " + speed + " when gear is :" + gear);
    }
}

public class ObjectsCharacteristics {
    public static void main(String args[]){
        //creating two car objects
        AnotherCar car1 = new AnotherCar();
        AnotherCar car2 = new AnotherCar();
        car1.changeGear(2);
        car1.speedUp(10);
        car1.stateOfCar();
        car1.changeGear(3);
        car1.speedUp(30);
        car1.stateOfCar();
        car1.changeGear(1);
        car1.speedDown(35);
        car1.stateOfCar();
        car2.changeGear(2);
        car2.speedUp(20);
        car2.stateOfCar();
        car2.changeGear(1);
        car2.stopCar(0);
        car2.stateOfCar();
    }
}