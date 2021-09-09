import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {


    public static void main(String[] args) {
//        System.out.println(addition(1,2));
//        System.out.println(subtraction(5,1));
//        System.out.println(multiplication(3,5));
//        System.out.println(division(15,3));
//        System.out.println(modulus(5,2));
//        System.out.println(getInteger(10, 30));
//        factorial();
        diceRoll();
    }
    public static int addition(int num1, int num2){
        return num1 + num2;
    }
    
    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }
    
    public static int multiplication(int num1, int num2){
        return num1 * num2;
//        for (int i = num2; i > 0; i--){
//            return num1 =+ i;
//        }
    }

    public static int division(int num1, int num2){
        return num1 / num2;
    }

    public static int modulus(int num1, int num2){
        return num1 % num2;
    }

    public static int getInteger(int min, int max){
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input < min || input > max){
            return getInteger(min, max);
        } return input;
    }

    public static long factorial(){
        System.out.println("Hello! Enter a number between 1 and 10 for a factorial.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int total = 1;
        if(input < 1 || input > 10){
            return factorial();
        }
        else if (input == 1) {
            System.out.println(1);
        } else {
            for(int i = 2; i <= input; i++){
                total *= i;
                System.out.println(total);
            }

        }
        System.out.println("Would you like to continue? [Y/N]");
        String response = sc.nextLine() + sc.next();
        if(response.equals("y")) {
            total *= (input + 1);
            System.out.println(total);
        }
        else if (response.equals("n")){
            System.out.println("Thank you for playing!");
        }
        return input;
    }

    public static int diceRoll(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey! Enter a number and we will use that as the number of sides on 2 dice.");
        int input = sc.nextInt();
        int dice1 = (int)(Math.random() * input) + 1;
        int dice2 = (int)(Math.random() * input) + 1;
        System.out.println("Okay! Would you like to roll the dice? [Y/N]");
        String roll = sc.nextLine() + sc.next();
        if (roll.equals("y")) {
            System.out.println("Your two numbers are " + dice1 + " and " + dice2 + "! Would you like to roll again? [Y/N]");
            String response = sc.nextLine() + sc.next();
            if (response.equals("y"))
                return diceRoll();
            else if (response.equals("n"))
                System.out.println("Thanks for playing!");
        } else {
            System.out.println("Awww. Okay then, I'll do it.");
            System.out.println("Your two numbers are " + dice1 + " and " + dice2 + "! Would you like to roll again? [Y/N]");
            String response = sc.nextLine() + sc.next();
            if (response.equals("y"))
                return diceRoll();
            else if (response.equals("n"))
                System.out.println("Thanks for playing!");
        }
        return input;
    }
}
