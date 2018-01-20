package singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {
    public static void main(String[] args) throws Exception {
        SingletonOne singletonOne = SingletonOne.getInstance();
        SingletonOne singletonOne2 = SingletonOne.getInstance();
        System.out.println(singletonOne == singletonOne2);


        //通过反射机制破解单例模式
        /*Class<?> clazz = Class.forName("singleton.SingletonOne");
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonOne instance = (SingletonOne) constructor.newInstance();
        System.out.println(singletonOne == instance);*/

        //通过序列化和反序列化破解单例模式
        FileOutputStream fos = new FileOutputStream("D:\\obj.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(singletonOne);

        FileInputStream fis = new FileInputStream("D:\\obj.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SingletonOne o = (SingletonOne) ois.readObject();
        ois.close();
        fis.close();
        oos.close();
        fos.close();
        System.out.println(o == singletonOne);
    }
}
