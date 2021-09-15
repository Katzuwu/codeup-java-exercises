package shapes;

public class Square extends Rectangle{
    private int side;

    public Square(int side){
        super(side, side);
    }

    public int getArea() {
        return super.getArea();
    }

    public int getPerimeter() {
        return super.getPerimeter();
    }
}
