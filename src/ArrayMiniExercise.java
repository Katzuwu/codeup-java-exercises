public class ArrayMiniExercise {
    public static void main(String[] args) {
        //    TODO: create an array of doubles called numbers and assign five different values (try with and without an initializer).
        double[] numbers = {1,2,3,4,5};
        double total = 0;
//    Find the sum of all five double values using an enhanced for loop.
        for (double number : numbers){
            total += number;
        }
//        System.out.println(total);
    }


}
