package Factory.simple;

public class Client {
    /**
     * 使用简单工厂模式创建对象
     *
     * @param args
     */
    public static void main(String[] args) {
        AudiCar audi = (AudiCar) CarFactory.createCar("Audi");
        BYDCar byd = (BYDCar) CarFactory.createCar("BYD");
    }
}
