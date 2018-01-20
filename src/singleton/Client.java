package singleton;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        SingletonOne singletonOne = SingletonOne.getInstance();
        SingletonOne singletonOne2 = SingletonOne.getInstance();
        System.out.println(singletonOne == singletonOne2);



        Class<?> clazz = Class.forName("singleton.SingletonOne");

        SingletonOne instance = (SingletonOne) clazz.newInstance();
        System.out.println(singletonOne == instance);


    }
}
