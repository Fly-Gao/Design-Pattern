package singleton;


public class SingletonTwo {
    //使用懒汗式创建单利模式，延时加载
    private static SingletonTwo instance;

    //提供一个访问该实例的全局访问点
    public static synchronized SingletonTwo getInstance() {
        if (instance == null) {
            instance = new SingletonTwo();
        }
        return instance;
    }

    //私有化构造器，禁止外部通过构造器创建实例
    private SingletonTwo() {
    }
}
