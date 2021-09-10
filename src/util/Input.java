package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString(){
        System.out.println("Give me a string.");
        return scanner.nextLine();
    }

    public Input(){
        this.scanner = new Scanner(System.in);
    }
}
