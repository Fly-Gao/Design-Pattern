package bridge;

public class Client {
    public static void main(String[] args) {
        Brand brand = new Lenovo();
        Computer computer = new DesktopComputer(brand);
        computer.sale();
    }
}
