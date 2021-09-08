import java.util.Objects;
import java.util.Scanner;

public class MyTherapist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your therapy session? How are you doing today?");
        String answer = scanner.next();
        if (Objects.equals(answer, "good")){
            System.out.println("That's good to hear! I'm happy to know you are doing well today");
        } else if (Objects.equals(answer, "bad")) {
            System.out.println("Oh no! I'm sorry to hear that. What's going on?");
        }
    }
}
