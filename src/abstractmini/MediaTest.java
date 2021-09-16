package abstractmini;

public class MediaTest {
    public static void main(String[] args) {
        Media book = new Book();
        book.listening();
        Media cd = new CD();
        cd.listening();
    }
}
