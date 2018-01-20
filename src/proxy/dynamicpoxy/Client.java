package proxy.dynamicpoxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        RealStart realStart = new RealStart();
        StarHandler handler = new StarHandler(realStart);
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
        proxy.sing();
    }
}
