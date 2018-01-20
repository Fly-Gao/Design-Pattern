package decorator;

/**
 * 装饰模式
 */
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("增加新的飞行功能！");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("增加新的功能，水上飞");
        WaterCar waterCar = new WaterCar(flyCar);
        waterCar.move();
    }
}
