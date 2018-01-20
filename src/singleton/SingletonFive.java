package singleton;

/**
 * 使用枚举方式创建，不是懒加载
 */
public enum SingletonFive {
    //枚举模式本身是单例的
    INSTANCE;

    //在这里添加自己的功能处理
    public void doSomething() {

    }
}
