import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = {
                new Person("Fox"),
                new Person("Falco"),
                new Person("Slippy")
        };
        personName(people);
        people = addPerson(people, new Person("Peppy"));
        personName(people);
    }

    public static void personName(Person[] people){
        for(Person person : people){
            System.out.println(person.getName());
        }
    }


    //received help from Albert to solve
    public static Person[] addPerson(Person[] people, Person person){
        Person[] newArray = Arrays.copyOf(people, people.length + 1);
        newArray[people.length] = person;
        System.out.println();
        return newArray;
    }
}
