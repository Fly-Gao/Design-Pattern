package proxy.dynamicpoxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
    private Star star;

    public StarHandler(Star star) {
        this.star = star;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(star, args);
        return null;
    }
}
