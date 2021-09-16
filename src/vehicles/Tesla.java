package vehicles;

public final class Tesla extends Vehicle {
    public void makeNoise(){
        super.makeNoise();
        System.out.println("I am a tesla. I make no noise. I'm really rich.");
    }

    public Tesla(String name){
        super.setName(name);
    }
}
