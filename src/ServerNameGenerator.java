import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {
                "Charming",
                "Cruel",
                "Fantastic",
                "Gentle",
                "Huge",
                "Perfect",
                "Rough",
                "Sharp",
                "Tasty",
                "Zealous"
        };
        String[] nouns = {
                "Nose",
                "Head",
                "Arrow",
                "Fish",
                "Whale",
                "Salt",
                "Paper",
                "Radio",
                "Coffee",
                "Tiger",
        };
        System.out.println("Okay! Here is your server name:\n" + randomString(adjectives) + "-" +randomString(nouns));
    }

    public static String  randomString(String[] array){
        Random generator = new Random();
        int randomIndex = generator.nextInt(array.length);
        return array[randomIndex];
    }
}
