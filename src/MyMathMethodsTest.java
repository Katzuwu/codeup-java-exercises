public class MyMathMethodsTest {
    public static void main(String[] args) {

        //non static
//        MyMathMethods multiply = new MyMathMethods();
//        System.out.println(multiply.multiply(10,10));
//        System.out.println(multiply.multiply(10.5, 10.5));

        //static
        System.out.println(MyMathMethods.multiply(10,10));
        System.out.println(MyMathMethods.multiply(10.5,10.5));
    }
}
