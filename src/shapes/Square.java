package shapes;

public class Square extends Quadrilateral implements Measurable{
    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }
}
