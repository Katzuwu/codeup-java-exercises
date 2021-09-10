package shapes;

import util.Input;
import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me any number, even one with a decimal, and that will be the number of the radius of your circle.");
        double userRadius = scanner.nextDouble();
        Circle userCircle = new Circle(userRadius);
        System.out.println("Okay! Here is your circumference: " + userCircle.getCircumference());
        System.out.println("And here is your area: " + userCircle.getArea());
    }
}
