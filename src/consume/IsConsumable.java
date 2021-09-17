package consume;

public interface IsConsumable {
    void consume();
    void checkIfExpired();
    void throwAway();
}
