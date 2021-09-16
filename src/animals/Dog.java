package animals;

public class Dog extends Animals {
    @Override
    public void responseToCommand(String command) {
        System.out.println("Obeys " + command + " dutifully...");
    }



}