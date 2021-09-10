public class Test {

    public static void main(String[] args) {
//        Fox Senko = new Fox();
//        Senko.name = "Senko";
//        Senko.sound = Quote.randomQuote();
//        Senko.makeNoise();
        Fox senko = new Fox("Senko", Quote.randomQuote());
        System.out.println(senko.getName());
        System.out.println(senko.getSound());
        senko.setName("Shiro");
        System.out.println(senko.getName());
    }

}
