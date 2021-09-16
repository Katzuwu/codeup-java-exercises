package animals;

public class Cat extends Animals {
    @Override
    public void responseToCommand(String command) {
        System.out.println("Meow... coughs up hairball...");
    }

}