public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Vroom vroom");
    }

    public void soundAlarm(){
        System.out.println("HELP SOMEONE IS TRYING TO STEAL ME");
    }
}
