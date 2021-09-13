package shapes;

import util.Input;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double userRadius = input.getDouble();
        System.out.println("Okay, we're going to make a circle out of that number");
        Circle userCircle = new Circle(userRadius);
        System.out.println("Okay! Here is your circumference: " + userCircle.getCircumference());
        System.out.println("And here is your area: " + userCircle.getArea());
    }
}
