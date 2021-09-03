import java.util.Scanner;

public class MyIOExperiment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String userName = scanner.nextLine();
//        System.out.println("Hello " + userName + "!");
        System.out.printf("Hello %s! %nNice to meet you!", userName);
    }
}
