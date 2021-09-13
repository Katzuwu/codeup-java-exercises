package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString(){
        System.out.println("Give me a string.");
        return scanner.nextLine();
    }

    public Boolean yesNo(String input){
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yeah");
    }

    public Boolean yesNo(){
        System.out.println("Please enter yes or no.");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yeah");
    }

    public int getInt(int min, int max){
        System.out.println("Enter a number between 1 and 10");
        int userInput = scanner.nextInt();
        if (userInput > min && userInput < max)
            return userInput;
        else
            return getInt(min, max);
    }

    public int getInt(){
        System.out.println("Give me an integer.");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.println("Give me a number with a decimal point between .1 and 10.9");
        double userInput = scanner.nextDouble();
        if (userInput > min && userInput < max)
            return userInput;
        else
            return getDouble(min, max);
    }

    public double getDouble(){
        System.out.println("Give me an number with a decimal point.");
        return scanner.nextDouble();
    }

    public Input(){
        this.scanner = new Scanner(System.in);
    }
}
