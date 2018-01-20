package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 通过单例模式可以保证系统中，应用该模式的类只有一个实例，通常用于创建数据库连接，使用BIO对文件进行操作时，
 * 必须保证一次只有一个实例对该指定的对象进行操作。
 */
public class SingletonOne implements Serializable {
    //使用饿汗式创建单利模式，在Java初始化类的时候会优先初始化静态变量，并保持全局只有一个该对象，但是不能延时加载
    private static SingletonOne instance = new SingletonOne();

    //提供一个访问该实例的全局访问点
    public static SingletonOne getInstance() {
        return instance;
    }

    //私有化构造器，禁止外部通过构造器创建实例
    private SingletonOne() {
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    //通过抛出ObjectStreamException，防止反序列化再次创建对象
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
