public class CreatePerson {
    public static void main(String[] args) {
//        Person bill = new Person("Bill");
//        bill.sayHello();
//        System.out.println(bill.getName());
//        bill.setName("Tom");
//        System.out.println(bill.getName());
//        bill.sayHello();


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

        //false because strings compare using .equals();
        //i guess it's true because it's going off the backend integers?
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        System.out.println(person1);
//        System.out.println(person2);

        //i think get name would be blank or similar because it's only getting the id? Then it would set name to Jane and print Jane.
        //weird. was not expecting jane to swap to both. wonder if the equals makes it so any changes affect both
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
