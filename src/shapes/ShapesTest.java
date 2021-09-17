package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Square box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

        Measurable myShape;
        myShape = new Square(14.2);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Rectangle(12.5, 24.3);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        //one getArea uses parameters to define the side of the square to differentiate it from the other one.
    }
}
