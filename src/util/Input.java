package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString(){
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
        try {
            return Integer.valueOf(getString());
        }
        catch (NumberFormatException nfx){
            System.out.println("Oh no! Looks like " + nfx + " isn't a valid integer.");
        }
        return 0;
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
        try {
            return Double.valueOf(getString());
        }
        catch (NumberFormatException nfx){
            System.out.println("Oops! Looks like " + nfx + " isn't a valid double.");
        }
        return 0;
    }

    public Input(){
        this.scanner = new Scanner(System.in);
    }
}
