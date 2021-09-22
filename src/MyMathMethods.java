public class MyMathMethods {

    //non static
//    public int multiply(int num1, int num2){
//        return num1 * num2;
//    }
//    public double multiply(double num1, double num2){
//        return num1 * num2;
//    }

    //static
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }
    public static double multiply(double num1, double num2){
        return num1 * num2;
    }

    public static int quotient(int num1, int num2){
        return num1/num2;
    }
    public static double quotient(double num1, double num2){
        return num1/num2;
    }

    public static int arraySum(int[] arr){
        int total = 0;
        for(Integer a : arr){
            total += a;
        } return total;
    }

}
