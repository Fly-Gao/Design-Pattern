package adapter;

/**
 * 客户端类
 */
public class Client {
    public void test(Target target) {
        target.handlerReq();
    }

    public static void main(String[] args) {
        Client client = new Client();
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        client.test(target);
    }
}
