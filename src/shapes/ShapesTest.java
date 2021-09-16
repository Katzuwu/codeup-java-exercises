package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Square box2 = new Square(5);
        System.out.println(box2.getArea(5));
        System.out.println(box2.getPerimeter(5));

        //one getArea uses parameters to define the side of the square to differentiate it from the other one.
    }
}
