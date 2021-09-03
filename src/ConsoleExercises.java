import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f%n", pi);
//        System.out.println("Ohayō Master, would you please enter an integer for me?");
//        int userInteger = scanner.nextInt();
//        System.out.println("The integer you enter Master was " + userInteger);
//        System.out.println("Enter 3 words for me Master. What is your first word?");
//        String firstWord = scanner.next() + scanner.nextLine();
//        System.out.println("What is your second word?");
//        String secondWord = scanner.nextLine();
//        System.out.println("What is your third word?");
//        String thirdWord = scanner.nextLine();
//        System.out.println("Master, the 3 words you entered are: " + firstWord + ", " + secondWord + ", " + thirdWord + ". You will now shut down.");
        System.out.println("Master, will you enter the length of your Codeup classroom?");
        String dn = scanner.nextLine();
        int length = Integer.parseInt(dn);
        System.out.println("Now will you enter the width of the Codeup classroom?");
        String candice = scanner.nextLine();
        int width = Integer.parseInt(candice);
        System.out.println("The perimeter of your classroom is " + ((length*2) + (width * 2)) + ". The area of your classroom is " + (length * width) + ".");
    }
}
