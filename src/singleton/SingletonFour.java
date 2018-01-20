package singleton;

/**
 * 使用静态内部类方式创建，懒加载
 */
public class SingletonFour {

    private static class SingletonFourInstance {
        private static final SingletonFour instance = new SingletonFour();
    }

    public SingletonFour getInstance() {
        return SingletonFourInstance.instance;
    }

    //私有化构造器，禁止外部通过构造器创建实例
    private SingletonFour() {
    }
}
