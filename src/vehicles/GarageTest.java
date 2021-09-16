package vehicles;

import vehicles.Car;
import vehicles.Garage;

public class GarageTest {
    public static void main(String[] args) {
        Vehicle car = new Car("Honda Civic");
//        car.setName("Honda Civic");
        Vehicle motorcycle = new Motorcycle("Yamaha R1");
//        motorcycle.setName("Yamaha R1");
        Vehicle truck = new Vehicle();
        truck.setName("Toyota Tundra");
        Vehicle tesla = new Tesla("Tesla Model S");
//        tesla.setName("Tesla Model S");
        Garage.vehicles[0] = car;
        Garage.vehicles[1] = motorcycle;
        Garage.vehicles[2] = truck;
        Garage.vehicles[3] = tesla;
        Garage.alarmCascade(Garage.vehicles);

//        Garage.findVehicle(Garage.vehicles, "Honda Civic");
//        Garage.findVehicle(Garage.vehicles, "Mustange");
    }
}
