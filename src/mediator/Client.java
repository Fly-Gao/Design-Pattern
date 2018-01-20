package mediator;

public class Client {
    public static void main(String[] args) {
        Mediator m = new President();
        Department dev = new Development(m);
        Department fin = new Finance(m);
        dev.outAction();
    }
}
