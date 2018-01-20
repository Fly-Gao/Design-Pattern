package flyweight;

/**
 * 享元模式主要用于创建大量重复的对象，分别有可共享状态和不可共享状态
 */
public class Client {
    public static void main(String[] args) {
        ChessFlyWeight coordinate = FlyweightFactory.getChess("黑色");
        coordinate.display(new Coordinate(10, 20));
        System.out.println(coordinate);
        coordinate = FlyweightFactory.getChess("黑色");
        coordinate.display(new Coordinate(20, 30));
        System.out.println(coordinate);
    }
}
