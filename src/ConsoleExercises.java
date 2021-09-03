import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f%n", pi);


//        System.out.println("Ohayō Master, would you please enter an integer for me?");
//        int userInteger = scanner.nextInt();
//        System.out.println("The integer you enter Master was " + userInteger);


//        System.out.println("Enter 3 words for me Master.");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.printf("Master, the 3 words you entered are: %n%s%n%s%n%s", firstWord, secondWord, thirdWord);


//        System.out.println("Will you enter a sentence for me, Master?");
//        String sentence = scanner.nextLine();
//        System.out.println(sentence);


        System.out.println("Master, will you enter the length of your Codeup classroom?");
        String dn = scanner.nextLine();
        int length = Integer.parseInt(dn);
        System.out.println("Now will you enter the width of the Codeup classroom?");
        String candice = scanner.nextLine();
        int width = Integer.parseInt(candice);
        System.out.println("The perimeter of your classroom is " + ((length*2) + (width * 2)) + ". The area of your classroom is " + (length * width) + ".");
    }
}
