package templateMethod;

/**
 * 模板方法模式
 */
public class Client {
    public static void main(String[] args) {
        DrawerMoney d = new DrawerMoney() {
            @Override
            protected void loading() {
                System.out.println("loading");
            }
        };
        d.stream();
    }
}
