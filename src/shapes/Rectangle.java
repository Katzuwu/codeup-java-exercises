package shapes;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(){

    }
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getPerimeter(){
        return (length * 2) + (width * 2);
    }

    public int getArea(){
        return length * width;
    }
}
