package strategy;

/**
 * 策略模式，类似于一种分发机制
 */
public class Client {
    public static void main(String[] args) {
        new Context(new OldStrategy()).price();
    }
}
