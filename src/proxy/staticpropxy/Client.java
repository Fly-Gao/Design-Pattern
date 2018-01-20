package proxy.staticpropxy;

public class Client {
    public static void main(String[] args) {
        ProxyStar proxy = new ProxyStar(new RealStart());
        proxy.sing();
    }
}
