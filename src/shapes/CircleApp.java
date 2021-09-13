package shapes;

import util.Input;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double userRadius = input.getDouble();
        System.out.println("Okay, we're going to make a circle out of that number");
        Circle userCircle = new Circle(userRadius);
        System.out.printf("Okay! Here is the circumference of your circle: %.2f\n", userCircle.getCircumference());
        System.out.printf("And here is your area: %.2f", userCircle.getArea());
    }
}
