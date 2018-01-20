package singleton;

/**
 * 双重检测锁模式，由于部分jvm底层不支持，可能出现未知的错误
 */
public class SingletonThree {
    private static SingletonThree instance;

    //提供一个访问该实例的全局访问点
    public static SingletonThree getInstance() {
        if (instance == null) {
            SingletonThree three = null;
            synchronized (SingletonThree.class) {
                three = instance;
                if (three == null) {
                    synchronized (SingletonThree.class) {
                        if (three == null) {
                            instance = new SingletonThree();
                        }
                    }
                }
            }
            instance = three;
        }
        return instance;
    }

    //私有化构造器，禁止外部通过构造器创建实例
    private SingletonThree() {
    }
}
