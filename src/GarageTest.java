public class GarageTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.setName("Honda Civic");
        Vehicle motorcycle = new Motorcycle();
        motorcycle.setName("Yamaha R1");
        Vehicle truck = new Vehicle();
        truck.setName("Toyota Tundra");
        Garage.vehicles[0] = car;
        Garage.vehicles[1] = motorcycle;
        Garage.vehicles[2] = truck;
        Garage.alarmCascade(Garage.vehicles);

        Garage.findVehicle(Garage.vehicles, "Honda Civic");
        Garage.findVehicle(Garage.vehicles, "Mustange");
    }
}
