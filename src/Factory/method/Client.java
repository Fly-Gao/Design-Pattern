package Factory.method;

/**
 * 方法工厂模式，需要为每一个对象添加一个工厂，造成类的大量累积
 */
public class Client {
    public static void main(String[] args) {
        Car car = BYDCarFactory.createCar();
        Car audi = AudiFactory.createCar();
    }
}
