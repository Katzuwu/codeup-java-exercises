public class MethodWarmup {
    public static void main(String[] args) {
//        System.out.println(getDifference(14, 24));
//        System.out.println(getDifference(14));
        System.out.println(addNums(5));
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
    // TODO: use recursion to add all numbers up from 1 to a given number
     public static int addNums(int num) {
         if (num==1)
             return 1;
         else
             return addNums(num-1)+num;
     }
}
