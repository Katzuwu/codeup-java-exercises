import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey! Let's play a guessing game. I'm gonna pick a random number between 1 and 100 and you're gonna try to guess which number it is.");
        int randomNumber = (int)(Math.random() * 101) + 1;
        System.out.println("Okay, I've picked a number. Start guessing and I'll tell you if you need to guess higher or lower. You have 10 guesses to get it right.");
        int tries = 10;
        while (tries != 0) {
           int userGuess = sc.nextInt();
           if (userGuess < randomNumber) {
               System.out.println("HIGHER");
               tries--;
           }
           else if (userGuess > randomNumber) {
               System.out.println("LOWER");
               tries--;
           }
           else if (userGuess == randomNumber) {
               System.out.println("GOOD GUESS");
               tries--;
               System.out.println("It took you this many tries: " + (10 - tries));
               break;
           }
            System.out.println("Tries remaining: " + tries);
       }
        System.out.println("Thanks so much for playing my game!");
    }
}
