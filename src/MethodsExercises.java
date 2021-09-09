import java.util.Objects;
import java.util.Scanner;

public class MethodsExercises {


    public static void main(String[] args) {
//        System.out.println(addition(1,2));
//        System.out.println(subtraction(5,1));
//        System.out.println(multiplication(3,5));
//        System.out.println(division(15,3));
//        System.out.println(modulus(5,2));
//        System.out.println(getInteger(10, 30));
//        factorial();

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
            } System.out.println(total);

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
}
