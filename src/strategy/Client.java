package strategy;

/**
 * 策略模式，类似于一种分发机制，针对每一类型，进行不同的处理
 */
public class Client {
    public static void main(String[] args) {
        new Context(new OldStrategy()).price();
    }
}
