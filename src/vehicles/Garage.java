package vehicles;

public class Garage {
    public static Vehicle[] vehicles = new Vehicle[4];

    public static void alarmCascade(Vehicle[] cars){
        for (Vehicle vehicle : cars){
            vehicle.soundAlarm();
        }
    }

    //my original solution
    public static void findVehicle(Vehicle[] vehicles, String car){
        for (Vehicle vehicle : vehicles){
            if(vehicle.getName().equals(car))
                System.out.println(vehicle.getName());
        }
    }

    //Teacher solution
//    public static vehicles.Vehicle findVehicle(vehicles.Vehicle[] vehicles, String car){
//        for (vehicles.Vehicle vehicle : vehicles){
//            if(vehicle.getName().equals(car))
//                return vehicle;
//        }
//        vehicles.Vehicle notHere = new vehicles.Vehicle();
//        notHere.setName(null);
//        return notHere;
//    }
}
