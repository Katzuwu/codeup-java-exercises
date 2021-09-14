public class VehicleTest {
    public static void main(String[] args) {
        Vehicle honda = new Vehicle();
        honda.setName("Honda Civic");
        System.out.println("This is my " + honda.getName());
        honda.makeNoise();

        Motorcycle yamaha = new Motorcycle();
        yamaha.setName("Yamaha R1");
        System.out.println("This is my " + yamaha.getName());
        yamaha.makeNoise();
    }


}
