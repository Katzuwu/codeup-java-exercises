package birds;

public class BirdShelterTest {
    public static void main(String[] args) {
        // Polymorphic Array:
        Bird[] birds = new Bird[3];
        birds[0] = new Finch();
        birds[0].setName("Greater Goldfinch");
        birds[1] = new Duck();
        birds[1].setName("Beeg Mallard");
        birds[2] = new Penguin();
        birds[2].setName("Skipper");

        BirdShelter healingWings = new BirdShelter();
        healingWings.visitShelterAndListenToTheBirds(birds);
    }
}
