import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
//        String userInput = input.getString();
//        System.out.println(userInput);

//        Boolean userYesOrNo = input.yesNo();
//        System.out.println(userYesOrNo);

//        int userInt = input.getInt(1, 10);
//        System.out.println(userInt);

//        int usersInteger = input.getInt();
//        System.out.println(usersInteger);

//        double usersInteger = input.getDouble(.1, 10.9);
//        System.out.println(usersInteger);

        double usersInteger = input.getDouble();
        System.out.println(usersInteger);
    }
}
