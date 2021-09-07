import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //problem 1
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }
//        int i = 105;
//        do {
//            i -=5;
//            System.out.println(i);
//        } while (i > -10);
//        for(int i = 100; i > -15; i-=5){
//            System.out.println(i);
//        }

//        long i = 2;
//        do {
//            i *= i;
//            System.out.println(i);
//        } while (i < 1000000);
//        for(long i = 2; i < 1000000; i *= i){
//            System.out.println(i);
//        }

// problem 2
//        for (int i = 1; i <= 100; i++)
//        {
//            if (((i % 3) == 0) && ((i % 5) == 0))
//                System.out.println("FizzBuzz");
//            else if ((i % 3) == 0)
//                System.out.println("Fizz");
//            else if ((i % 5) == 0)
//                System.out.println("Buzz");
//            else
//                System.out.println(i);
//        }

        //problem 3
//        System.out.println("Enter a number for me to display on a table!");
//        int userInt = scanner.nextInt();
//        System.out.println("Here is your table!\n");
//        System.out.println("Number  |  Squared  |  Cubed");
//        System.out.println("--------|-----------|--------");
//        for (int i = 1; i <= userInt; i++){
//            System.out.println(i + "       |     " + (i * i) + "     |   " + (i * i * i));
//        }

        //problem 4
        System.out.println("Enter your grade in a number and I'll tell you A-F what you got!");
        int userGrade = scanner.nextInt();
        if (userGrade > 87){
            System.out.println("You got an A!");
        } else if (userGrade > 79) {
            System.out.println("You got a B!");
        } else if(userGrade > 66){
            System.out.println("You got a C!");
        } else if (userGrade > 59){
            System.out.println("You got a D!");
        } else {
            System.out.println("You got an F. Do better!");
        }
    }
}
