public class MethodWarmup {
    public static void main(String[] args) {
        System.out.println(getDifference(14, 24));
        System.out.println(getDifference(14));
    }
    public static int getDifference(int one, int two){
        if(two > one){
            return two - one;
        } else {
            return one - two;
        }
    }
    public static int getDifference(int one){
        return one - 0;
    }
}
