package birds;

public class BirdShelter {
    public void visitShelterAndListenToTheBirds(Bird[] allTheBirdsInTheShelter){
        for(Bird bird : allTheBirdsInTheShelter){
            System.out.println(bird.getName() + " says: ");
            bird.makeNoise();
        }
    }
}
