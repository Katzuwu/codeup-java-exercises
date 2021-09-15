package vehicles;

public class Car extends Vehicle {

    public void makeNoise() {
        System.out.println("Beep Beep!");
    }

    public void soundAlarm() {
        System.out.println("INTRUDER ALERT");
    }

    public Car(){

    }

    public Car(String name){
        super(name);
    }
}
