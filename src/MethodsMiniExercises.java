import java.util.Scanner;

public class MethodsMiniExercises {

    // TODO: break the following code apart into a few methods

    public static void main(String[] args) {
        doInputsMatch();
    }
    public static int comparingInteger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        int intInput = sc.nextInt();
        return intInput;
    }
    public static String userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an input.");
        String stringInput = sc.nextLine();
        return stringInput;
    }
    public static void doInputsMatch(){
        if (userInput().length() == comparingInteger()) {
            System.out.println("That matches the length of the input!");
        } else {
            System.out.println("That doesn't match the length of the input!");
        }
    }

}