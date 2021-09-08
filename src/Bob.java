import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String talkingToBob;
        do {
            talkingToBob = scanner.nextLine();
            if (talkingToBob.endsWith("?")) {
                System.out.println("Sure!");
            } else if (talkingToBob.endsWith("!")) {
                System.out.println("Whoa, chill out man!");
            } else if (talkingToBob.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }
        } while (!talkingToBob.equals("Okay, I'm done talking to you."));
    }
}
