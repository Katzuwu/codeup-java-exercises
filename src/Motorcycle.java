public class Motorcycle extends Vehicle{
    public void makeNoise() {
        System.out.println("Hey, watch where you're going! I'm smaller than you!");
    }

    public void breakingDownNoise(){
        super.makeNoise();
        System.out.println("Aw man, I'm out of gas!");
    }
}
