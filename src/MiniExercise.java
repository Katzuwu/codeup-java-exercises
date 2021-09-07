import java.util.Scanner;

public class MiniExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int x = 5;
//        int y = -5;
//        if (x > 0) {
//            System.out.println("This number is positive!");
//        } else {
//            System.out.println("This number is negative!");
//        }
//        if (y > 0) {
//            System.out.println("This number is positive!");
//        } else {
//            System.out.println("This number is negative!");
//        }
        System.out.println("Hello User! How old are you?");
        int userAge = scanner.nextInt();
        if(userAge >= 20) {
            System.out.println("You are older than a teenager!");
        } else if (userAge >= 13) {
            System.out.println("Wow! You are a teenager!");
        } else {
            System.out.println("Sorry, you are younger than a teenager :(");
        }
    }
}
