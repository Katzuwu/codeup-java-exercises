public class StringTransformerTest {
    public static void main(String[] args) {
        StringTransformer string = new UpperCaseStringTransformer("hello world");
        StringTransformer string2eb = new ReverseStringTransformer("I will be reversed");
        System.out.println(string.transform());
        System.out.println(string2eb.transform());
        StringTransformer[] strings = {string, string2eb};
        for(StringTransformer strang : strings){
            System.out.println(strang.transform());
        }
    }
}
