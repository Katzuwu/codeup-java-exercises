package animals;

public class AnimalsTest {
    public static void main(String[] args) {
        Animals dog = new Dog();
        dog.setName("Fido");
        dog.setAge(5);
        dog.setSpecies("Corgi");
        System.out.println("This is " + dog.getName() + ". He is " + dog.getAge() + ". He is a " + dog.getSpecies() + ".");
        dog.responseToCommand("Sit");

        Animals cat = new Cat();
        cat.setName("Howard");
        cat.setAge(10);
        cat.setSpecies("cat");
        System.out.println("This is " + cat.getName() + ". He is " + cat.getAge() + ". He is a " + cat.getSpecies() + ".");
        cat.responseToCommand("Stay");
    }
}
