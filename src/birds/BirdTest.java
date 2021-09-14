package birds;

public class BirdTest {
    public static void main(String[] args) {
        Bird cardinal = new Bird();
        cardinal.setName("Cardinal");
        System.out.println(cardinal.getName() + " says:");
        cardinal.makeNoise();
        cardinal.move();

        Duck mallard = new Duck();
        mallard.setName("Mallard");
        System.out.println(mallard.getName() + " says:");
        mallard.makeNoise();
        mallard.move();

        Finch goldfinch = new Finch();
        goldfinch.setName("Goldy");
        System.out.println(goldfinch.getName() + " says:");
        goldfinch.makeNoise();

        Bird myBird = new Duck();
        myBird.makeNoise();
    }
}
