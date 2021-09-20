import java.util.ArrayList;

public class CollectionsTest {
    public static void omit2s(ArrayList<Integer> integer){
        integer.removeIf(i -> i == 2);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(2);
        numbers.add(5);

        System.out.println(numbers);
        omit2s(numbers);
        System.out.println(numbers);
    }
}
