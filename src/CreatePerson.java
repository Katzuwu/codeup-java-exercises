public class CreatePerson {
    public static void main(String[] args) {
        Person bill = new Person("Bill");
        bill.sayHello();
        System.out.println(bill.getName());
        bill.setName("Tom");
        System.out.println(bill.getName());
        bill.sayHello();
    }
}
