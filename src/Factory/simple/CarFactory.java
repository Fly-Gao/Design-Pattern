package Factory.simple;

public class CarFactory {
    public static Car createCar(String type) {
        if (type.equals("Audi")) {
            return new AudiCar();
        } else if (type.equals("BYD")) {
            return new BYDCar();
        }
        return null;
    }
}
