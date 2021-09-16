package shapes;

public class Square extends Rectangle{

    protected int side;

    public Square(int side){
        super(side, side);
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }

    //public int getArea(){
    // return
    // };

    public int getPerimeter() {
        return side * 4;
    }
}
